package JAVA_OOP.polymorphism.vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
        input = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2]));

        int number = Integer.parseInt(scanner.nextLine());

        while (number-- > 0) {
            input = scanner.nextLine().split("\\s+");
            if ("Car".equals(input[1])) {
                if ("Drive".equals(input[0])) {
                    System.out.println(car.drive(Double.parseDouble(input[2])));
                } else {
                    car.refuel(Double.parseDouble(input[2]));
                }
            } else {
                if ("Drive".equals(input[0])) {
                    System.out.println(truck.drive(Double.parseDouble(input[2])));
                } else {
                    truck.refuel(Double.parseDouble(input[2]));
                }
            }
        }
        System.out.println(car);
        System.out.println(truck);
    }
}
