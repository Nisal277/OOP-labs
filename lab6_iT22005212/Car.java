package lab6_IT22005212;

public class Car extends Vehicle {

    private int engineCapacity;
    private double topSpeed;

    // Default constructor
    public Car() {
        super("Car");
        engineCapacity = 1500;
        topSpeed = 180.0;
    }

    // Parameterized constructor
    public Car(String vehicleName, int engineCapacity, double topSpeed) {
        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    // Method overriding
    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    // Method overriding
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Top Speed: " + calculateSpeed() + " km/h");
    }
}
