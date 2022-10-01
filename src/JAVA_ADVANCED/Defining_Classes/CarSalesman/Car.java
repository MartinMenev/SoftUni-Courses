package JAVA_ADVANCED.Defining_Classes.CarSalesman;

import java.util.Map;

public class Car {
    private String model;
    private Map<String, Engine> engineMap;
    private String weight = "n/a";
    private String color = "n/a";

    public Car(String model, Map<String, Engine> engineMap) {
        this.model = model;
        this.engineMap = engineMap;
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

    public Map<String, Engine> getEngineMap() {
        return engineMap;
    }

    public void setEngineMap(Map<String, Engine> engineMap) {
        this.engineMap = engineMap;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(
                "%s:\n%s:\nPower: %d\nDisplacement: %s\nEfficiency: %s\nWeight: %s\nColor: %s",
                getModel(), getEngineMap().get(getModel()).getEngineModel(), getEngineMap().get(getModel()).getPower(), getEngineMap().get(getModel()).getDisplacement(),
                getEngineMap().get(getModel()).getEfficiency(), weight, color);
    }
}
