package JAVA_ADVANCED.Defining_Classes.Google;

public class Car {
    private final String carModel;
    private final String carSpeed;

    public Car(String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        String result = "Car:";
        if (!carModel.isBlank())
            result = String.format("Car:%n%s %s", carModel,carSpeed);

        return result;
    }
}
