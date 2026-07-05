package cia1.java.B;

import java.util.ArrayList;

// Interface
interface Bookable {
    void book();
}

abstract class Flight {
    String flightNumber;
    Flight(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    abstract void flightDetails();
}
