package JAVA_OOP.polymorphism.vehicles;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;


    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }


    abstract String drive(double distance);

    abstract void refuel(double liters);

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), fuelQuantity);
    }
}
