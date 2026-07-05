package cia1.java.B;

import java.util.ArrayList;

public class AirlineReservation {
    public static void main(String[] args) throws Exception {
        ArrayList<Passenger> bookings = new ArrayList<>();

        // Create Flights
        Flight f1 = new DomesticFlight("DF101");
        Flight f2 = new InternationalFlight("IF202");

        f1.flightDetails();
        f2.flightDetails();

        // Booking passengers
        Passenger p1 = new Passenger("John Doe", "A1");
        Passenger p2 = (Passenger) p1.clone(); // Cloning passenger
        p2.name = "ronald weasley";
        p2.seat = p2.new Seat("B2");

        bookings.add(p1);
        bookings.add(p2);

        for (Passenger p : bookings) {
            System.out.println(p);
        }

        // Book flights
        ((Bookable) f1).book();
        ((Bookable) f2).book();
    }
}
