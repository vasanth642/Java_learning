package cia1.java.B;

class DomesticFlight extends Flight implements Bookable {
    DomesticFlight(String fn) {
        super(fn);
    }
    public void book() {
        System.out.println("Domestic flight " + flightNumber + " booked.");
    }
    void flightDetails() {
        System.out.println("Domestic Flight No: " + flightNumber);
    }
}

