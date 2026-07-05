package vasanth.methodOverloadingAndOverriding;

public class Vehicle {
        String brand;
        int maxSpeed;

        Vehicle(String b, int s) {
            brand = b;
            maxSpeed = s;
        }

        void displayInfo() {
            System.out.println("Vehicle Brand: " + brand);
            System.out.println("Vehicle Max Speed: " + maxSpeed + " km/h");
        }

        void startEngine() {
            System.out.println("Vehicle engine started.");
        }

        void startEngine(String fuelType) {
            System.out.println("Vehicle engine started with " + fuelType + ".");
        }

        void startEngine(String fuelType, int temperature) {
            System.out.println("Vehicle engine started with " + fuelType +
                    " at " + temperature + " degrees.");
        }
}
