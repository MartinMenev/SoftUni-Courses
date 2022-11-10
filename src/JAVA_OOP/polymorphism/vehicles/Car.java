package JAVA_OOP.polymorphism.vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle{
    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    String drive(double distance) {
        if (fuelQuantity >= distance * fuelConsumption) {
            fuelQuantity -= distance * fuelConsumption;
            DecimalFormat df = new DecimalFormat("###.##");
            return String.format("Car travelled %s km", df.format(distance));
        }
        return "Car needs refueling";
    }

    @Override
    void refuel(double liters) {
        this.fuelQuantity += liters;

    }
}
