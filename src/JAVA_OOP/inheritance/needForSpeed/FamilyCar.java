package JAVA_OOP.inheritance.needForSpeed;

public class FamilyCar extends Car {
    public FamilyCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(3);
    }
}
