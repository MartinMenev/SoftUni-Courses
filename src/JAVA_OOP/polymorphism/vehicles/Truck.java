package JAVA_OOP.polymorphism.vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    String drive(double distance) {
        if (fuelQuantity >= distance * (fuelConsumption + 1.6)) {
        fuelQuantity -= distance * (fuelConsumption + 1.6);
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
