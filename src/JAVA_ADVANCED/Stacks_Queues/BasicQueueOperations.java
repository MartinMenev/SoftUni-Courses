package JAVA_ADVANCED.Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.min;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        int numberOfElements = Integer.parseInt(tokens[0]);
        int elementsToRemove = Integer.parseInt(tokens[1]);
        int checkElement = Integer.parseInt(tokens[2]);

        int [] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numberOfElements; i++) {
            queue.offer(numbers[i]);
        }
        for (int i = 0; i < elementsToRemove; i++) {
            queue.poll();
        }
        if (queue.contains(checkElement)) {
            System.out.println(true);
            return;
        }
        int minElement = 0;
        if (!queue.isEmpty()) {
            minElement = min(queue);
        }
        System.out.println(minElement);
    }
}
