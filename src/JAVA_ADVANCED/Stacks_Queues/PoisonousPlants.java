package JAVA_ADVANCED.Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> plantsQueue = new ArrayDeque<>();
        for (int i = 0; i < number; i++) {
            plantsQueue.offerFirst(arr[i]);
        }
        int countDays = 0;
        while (plantsQueue.size() >= 1) {
            boolean plantDiesToday = false;
            int interCount = plantsQueue.size();
                for (int i = 0; i < interCount; i++) {
                    if (plantsQueue.size() <= 2) {
                        break;
                    }
                    int rightPlant = plantsQueue.poll();
                    int leftPlant = plantsQueue.peek();
                    if (rightPlant < leftPlant) {
                        plantsQueue.offer(rightPlant);
                    } else {
                        plantDiesToday = true;
                    }
                }

            if (plantDiesToday) {
                countDays++;
            } else {
                break;
            }
        }
        System.out.println(countDays);
    }
}
