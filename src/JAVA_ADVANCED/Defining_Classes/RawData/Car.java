package JAVA_ADVANCED.Defining_Classes.RawData;

import java.util.List;

public class Car {
    private final String model;
    private final Engine engine;
    private final Cargo cargo;
    private final List<Tire> tires;

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public static void printFragile(List<Car> cars) {
        for (Car car : cars) {
            if (car.getCargo().getType().equals("fragile")) {
                boolean validTires = true;

                for (var tire : car.tires) {
                    if (tire.getPressure() >= 1) {
                        validTires = false;
                        break;
                    }
                    break;
                }
                if (validTires)
                    System.out.println(car);
            }
        }
    }

    public static void printFlamable (List<Car> cars) {
        for (Car car : cars) {
            if (car.getCargo().getType().equals("flamable")) {
                if (car.getEngine().getPower() > 250) {
                    System.out.println(car);
                }
            }
        }
    }


    @Override
    public String toString() {
        return model;
    }
}
