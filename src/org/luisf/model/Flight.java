package org.luisf.model;

import java.util.Date;

public class Flight {
    private String name;
    private String origin;
    private String destination;
    private Date arrivalDate;
    private int passengers;

    public Flight(String name, String origin, String destination, Date arrivalDate, int passengers) {
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.arrivalDate = arrivalDate;
        this.passengers = passengers;
    }
}
