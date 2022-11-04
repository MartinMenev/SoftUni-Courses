package JAVA_OOP.polymorphism.vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle{

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    String drive(double distance) {
        if (fuelQuantity >= distance * (fuelConsumption + 0.9)) {
            fuelQuantity -= distance * (fuelConsumption + 0.9);
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
