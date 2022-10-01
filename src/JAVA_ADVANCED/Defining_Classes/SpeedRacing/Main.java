package JAVA_ADVANCED.Defining_Classes.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int fuelAmount = Integer.parseInt(input[1]);
            double fuelCostPerKm = Double.parseDouble(input[2]);

            Car car = new Car(model, fuelAmount, fuelCostPerKm);
            cars.put(model, car);
        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] line = input.split("\\s+");
            String model = line[1];
            int amountOfKm = Integer.parseInt(line[2]);

            if (!cars.get(model).canMove(amountOfKm)) {
                System.out.println("Insufficient fuel for the drive");
            }

            input = scanner.nextLine();
        }
        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }
}

