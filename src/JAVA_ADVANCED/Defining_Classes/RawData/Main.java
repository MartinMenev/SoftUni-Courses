package JAVA_ADVANCED.Defining_Classes.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        while(n-- > 0){
            String[]line = scanner.nextLine().split("\\s+");
            String model = line[0];
            int engineSpeed = Integer.parseInt(line[1]);
            int enginePower = Integer.parseInt(line[2]);

            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(line[3]);
            String cargoType = line[4];

            Cargo cargo = new Cargo(cargoWeight, cargoType);

            int s = 0;

            List <Tire> tires = new ArrayList<>();

            while (s++ < 8) {
                double pressure = Double.parseDouble(line[4 + s]);
                s++;
                int age = Integer.parseInt(line[4 + s]);

                tires.add(new Tire(pressure, age));
            }

            Car car = new Car(model, engine, cargo, tires);

            cars.add(car);
        }

        String command = scanner.nextLine();

        switch (command) {
            case "fragile" -> Car.printFragile(cars);
            case "flamable" -> Car.printFlamable(cars);
        }
    }
}
