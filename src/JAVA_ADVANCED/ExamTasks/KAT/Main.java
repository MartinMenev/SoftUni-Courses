package JAVA_ADVANCED.ExamTasks.KAT;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> licencePlatesQueue = new ArrayDeque<>();
        Deque<Integer> carsStack = new ArrayDeque<>();
        String[] firstLine = readArray(scanner);

        for (String j : firstLine) {
            licencePlatesQueue.offer(Integer.parseInt(j));
        }
        String[] secondLine = readArray(scanner);

        for (String i : secondLine) {
            carsStack.push(Integer.parseInt(i));
        }
        int numberRegisteredCars = 0;
        int dayCount = 0;

        while (!carsStack.isEmpty() && !licencePlatesQueue.isEmpty()) {
            dayCount++;
            int currentCars = carsStack.pop();
            int currentPlates = licencePlatesQueue.poll();
            boolean registrationRule = currentCars == currentPlates / 2;
            if (registrationRule) {
                numberRegisteredCars += currentCars;
            } else if (currentPlates / 2 < currentCars) {
                numberRegisteredCars += currentPlates / 2;
                int remainingCars = currentCars - (currentPlates / 2);
                carsStack.push(remainingCars);
            } else {
                numberRegisteredCars += currentCars;
                int remainingPlates = currentPlates - currentCars * 2;
                licencePlatesQueue.offer(remainingPlates);

            }
        }
        System.out.printf("%d cars were registered for %d days!%n", numberRegisteredCars, dayCount);

        if(!licencePlatesQueue.isEmpty()) {
            int platesCount = 0;
            for (Integer integer : licencePlatesQueue) {
                platesCount +=integer;
            }
            System.out.printf("%d license plates remain!%n", platesCount);
        } else if (!carsStack.isEmpty()) {
            int carsCount = 0;
            for (Integer integer : carsStack) {
                carsCount += integer;
            }
            System.out.printf("%d cars remain without license plates!%n", carsCount);
        } else {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
    }

    private static String[] readArray (Scanner scanner) {
      return scanner.nextLine().split(", ");
    }
}
