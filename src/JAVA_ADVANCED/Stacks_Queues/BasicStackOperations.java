package JAVA_ADVANCED.Stacks_Queues;

import java.util.*;

import static java.util.Collections.min;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        int numberOfElements = Integer.parseInt(tokens[0]);
        int elementsToPop = Integer.parseInt(tokens[1]);
        int checkElement = Integer.parseInt(tokens[2]);

        int [] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfElements; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();

            }
        if (stack.contains(checkElement)) {
                System.out.println(true);
                return;
        }
        int minElement = 0;
        if (!stack.isEmpty()) {
            minElement = min(stack);
        }
        System.out.println(minElement);
    }
}
