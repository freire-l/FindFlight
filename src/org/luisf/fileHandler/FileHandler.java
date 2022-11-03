/* Based on code found in https://www.javatpoint.com/how-to-read-csv-file-in-java */

package org.luisf.fileHandler;

import org.luisf.model.Flight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileHandler {
    private String line = "";
    private String splitter = ",";

    public List<Flight> readFile(String filename) throws FileNotFoundException {
        List<Flight> contents = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null){
                String[] flightDetails = line.split(splitter);

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return contents;

    }
}
