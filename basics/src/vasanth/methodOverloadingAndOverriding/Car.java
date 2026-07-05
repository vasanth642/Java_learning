package vasanth.methodOverloadingAndOverriding;

class Car extends Vehicle {
    int wheels;
    String color;

    Car(String b, int s, int w, String c) {
        super(b, s); // Calls Vehicle constructor
        wheels = w;
        color = c;
    }

    // Method overriding
    @Override
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Max Speed: " + maxSpeed + " km/h");
        System.out.println("Car Wheels: " + wheels);
        System.out.println("Car Color: " + color);
    }

    // Method overloading in subclass
    void startEngine(int rpm) {
        System.out.println("Car engine started at " + rpm + " RPM.");
    }

    void startEngine(String fuelType, int temperature, boolean turbo) {
        System.out.println("Car engine started with " + fuelType +
                ", temperature: " + temperature +
                ", Turbo mode: " + turbo);
    }
}
