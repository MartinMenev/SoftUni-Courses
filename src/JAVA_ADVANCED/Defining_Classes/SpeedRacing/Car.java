package JAVA_ADVANCED.Defining_Classes.SpeedRacing;

public class Car {
    private final String model;
    private double fuelAmount;
    private final double fuelCostPerKm;
    private int distanceTravelled = 0;

    public Car(String model, int fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
    }

    public boolean canMove (int distance) {

       if(fuelAmount < fuelCostPerKm * distance) return false;

       this.fuelAmount -= fuelCostPerKm * distance;
        this.distanceTravelled += distance;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distanceTravelled);
    }
}
