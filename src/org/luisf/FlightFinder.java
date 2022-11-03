package org.luisf;

import org.luisf.fileHandler.FileHandler;
import org.luisf.model.Flight;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public static void main(String[] args) throws FileNotFoundException {
        List<Flight> flights = FileHandler.readFile("D:\\Users\\luisf\\One\\Documents\\javaProjects\\FlightFinder\\src\\org\\luisf\\fileHandler\\vuelos.csv");
    }
}
