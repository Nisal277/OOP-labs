package lab6_IT22005212;

public class VehicleApp {

    public static void main(String[] args) {

        // Create Car object using default constructor
        Car car = new Car();

        // Create Bicycle object using parameterized constructor
        Bicycle bicycle = new Bicycle("Mountain Bicycle", 21, 35.0);

        // Calculate speeds using both overloaded methods
        System.out.println("===== CAR DETAILS =====");

        System.out.println("Default Speed: " + car.calculateSpeed());
        System.out.println("Speed with Factor (1.5): " + car.calculateSpeed(1.5));

        car.displayVehicleDetails();


        System.out.println("\n===== BICYCLE DETAILS =====");

        System.out.println("Default Speed: " + bicycle.calculateSpeed());
        System.out.println("Speed with Factor (1.5): " + bicycle.calculateSpeed(1.5));

        bicycle.displayVehicleDetails();
    }
}
