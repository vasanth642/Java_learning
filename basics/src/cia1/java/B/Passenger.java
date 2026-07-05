package cia1.java.B;

class Passenger implements Cloneable {
    String name;
    Seat seat;

    class Seat {
        String seatNo;
        Seat(String seatNo) {
            this.seatNo = seatNo;
        }
    }

    Passenger(String name, String seatNo) {
        this.name = name;
        this.seat = new Seat(seatNo);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "Passenger: " + name + ", Seat: " + seat.seatNo;
    }
}
