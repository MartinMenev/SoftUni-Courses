package JAVA_ADVANCED.Defining_Classes.CarSalesman;

public class Engine {
    private String engineModel;
    private int power;
    private String displacement = "n/a";
    private String efficiency = "n/a";

    public Engine(String engineModel, int power) {
        this.engineModel = engineModel;
        this.power = power;
    }

    public String getEngineModel() {
        return this.engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}
