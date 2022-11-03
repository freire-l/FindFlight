/* Based on code found in https://www.javatpoint.com/how-to-read-csv-file-in-java */

package org.luisf.fileHandler;

import org.luisf.model.Flight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileHandler {
    private static String line = "";
    private static String splitter = ",";
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd MMM yyyy");

    public static List<Flight> readFile(String filename) throws FileNotFoundException {
        List<Flight> contents = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            br.readLine(); //reading first line
            while ((line = br.readLine()) != null){
                String[] flightDetails = line.split(splitter);
                contents.add(new Flight(flightDetails[0], flightDetails[1],flightDetails[2], dateFormat.parse(flightDetails[3]), Integer.valueOf(flightDetails[5])));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return contents;

    }
}
