package JAVA_ADVANCED.Defining_Classes.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engineMap = new HashMap<>();

        while (n-- >0) {
            String[] line = scanner.nextLine().split("\\s+");
            String engineModel = line[0];
            int enginePower = Integer.parseInt(line[1]);

            Engine engine = new Engine(engineModel, enginePower);

            if (line.length >= 3) {
                char symbol = line[2].charAt(0);
                if (Character.isDigit(symbol)) {
                    engine.setDisplacement(line[2]);
                    if (line.length == 4) {
                        engine.setEfficiency(line[3]);
                    }
                } else {
                    engine.setEfficiency(line[2]);
                    if (line.length == 4) {
                        engine.setDisplacement(line[3]);
                    }
                }
            }


            engineMap.put(engineModel, engine);
        }

        n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String carModel = line[0];
            String engineModel = line[1];


            Car car = new Car(carModel, engineMap.get(engineModel));

            if (line.length >= 3) {
                char symbol = line[2].charAt(0);
                if (!Character.isDigit(symbol)) {
                    car.setColor(line[2]);
                    if (line.length == 4) {
                        car.setWeight(line[3]);
                    }
                } else {
                    car.setWeight(line[2]);
                    if (line.length == 4) {
                        car.setColor(line[3]);
                    }
                }
            }
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
