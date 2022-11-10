package JAVA_OOP.polymorphism.vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {

    public final static double AC_ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    String drive(double distance) {
        if (fuelQuantity >= distance * fuelConsumption) {
        fuelQuantity -= distance * fuelConsumption;
        DecimalFormat df = new DecimalFormat("###.##");
        return String.format("Truck travelled %s km", df.format(distance));
    }
        return "Truck needs refueling";
    }

    @Override
    void refuel(double liters) {
        this.fuelQuantity += liters * 0.95;
    }
}
