package JAVA_ADVANCED.Defining_Classes.CarSalesman;

import java.util.Map;

public class Car {
    private String model;
    private Engine engine;
    private String weight = "n/a";
    private String color = "n/a";

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }



    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(
                "%s:\n%s:\nPower: %d\nDisplacement: %s\nEfficiency: %s\nWeight: %s\nColor: %s",
                getModel(), getEngine().getEngineModel(), getEngine().getPower(), getEngine().getDisplacement(),
                getEngine().getEfficiency(), weight, color);
    }
}
