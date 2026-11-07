package lab6_IT22005212;

public class Vehicle {

    protected String vehicleName;

    // Default constructor
    public Vehicle() {
        vehicleName = "Unknown Vehicle";
    }

    // Parameterized constructor
    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Display vehicle name
    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
    }

    // Method overloading - default speed
    public double calculateSpeed() {
        return 0.0;
    }

    // Method overloading - speed with factor
    public double calculateSpeed(double factor) {
        return calculateSpeed() * factor;
    }
}
