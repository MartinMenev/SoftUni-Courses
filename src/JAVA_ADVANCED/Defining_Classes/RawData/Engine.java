package JAVA_ADVANCED.Defining_Classes.RawData;

public class Engine {
    private final int power;

    public Engine(int speed, int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
