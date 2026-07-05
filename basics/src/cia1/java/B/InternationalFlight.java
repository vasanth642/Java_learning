package cia1.java.B;

class InternationalFlight extends Flight implements Bookable {
    InternationalFlight(String fn) {
        super(fn);
    }
    public void book() {
        System.out.println("International flight " + flightNumber + " booked.");
    }
    void flightDetails() {
        System.out.println("International Flight No: " + flightNumber);
    }
}
