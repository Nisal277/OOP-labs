package lab6_IT22005212;

public class Bicycle extends Vehicle {

    private int gearCount;
    private double maxPedalSpeed;

    // Default constructor
    public Bicycle() {
        super("Bicycle");
        gearCount = 1;
        maxPedalSpeed = 25.0;
    }

    // Parameterized constructor
    public Bicycle(String vehicleName, int gearCount, double maxPedalSpeed) {
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    // Method overriding
    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    // Method overriding
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Maximum Pedaling Speed: " + calculateSpeed() + " km/h");
    }
}
