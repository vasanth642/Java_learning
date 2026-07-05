package vasanth.methodOverloadingAndOverriding;

public class Main {
    public static void main(String[] args) {
        // Vehicle object
        Vehicle v = new Vehicle("Generic Vehicle", 120);
        System.out.println("=== Vehicle Info ===");
        v.displayInfo();            // Vehicle method
        v.startEngine();            // Overloaded methods
        v.startEngine("Petrol");
        v.startEngine("Diesel", 90);

        System.out.println("\n=== Car Info ===");
        // Car object
        Car c = new Car("Toyota", 180, 4, "Red");
        c.displayInfo();            // Overridden method
        c.startEngine();            // Inherited Vehicle method
        c.startEngine("Diesel");    // Inherited Vehicle overloaded method
        c.startEngine(3500);        // Overloaded method in Car
        c.startEngine("Petrol", 80, true); // Overloaded method in Car
    }
}