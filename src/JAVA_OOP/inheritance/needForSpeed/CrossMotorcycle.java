package JAVA_OOP.inheritance.needForSpeed;

public class CrossMotorcycle extends Motorcycle {
    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(1.25);
    }
}
