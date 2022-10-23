package JAVA_OOP.abstraction.trafficLight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<TrafficLight> trafficLightList = new ArrayList<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (String signal : input) {
            TrafficLight trafficLight = new TrafficLight(Light.valueOf(signal));
            trafficLightList.add(trafficLight);
        }
        while (number-- > 0) {
            for (TrafficLight trafficLight : trafficLightList) {
                printNextColor(trafficLight);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void printNextColor(TrafficLight trafficLight) {
        System.out.print(trafficLight.changeLight());
    }
}
