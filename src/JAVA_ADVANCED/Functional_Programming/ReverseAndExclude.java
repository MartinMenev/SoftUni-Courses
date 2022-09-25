package JAVA_ADVANCED.Functional_Programming;

import java.util.*;
import java.util.function.BiFunction;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> numbers = new ArrayDeque<>();
        for (String n : scanner.nextLine().split("\\s+")) {
            numbers.push(Integer.parseInt(n));
        }

        int divideNumber = Integer.parseInt(scanner.nextLine());

        BiFunction<Deque<Integer>, Integer, String> result = getReversedCollection();

        System.out.println(result.apply(numbers, divideNumber));
    }

    private static BiFunction<Deque<Integer>, Integer, String> getReversedCollection() {
        return (stack, divider) -> {
            StringBuilder output = new StringBuilder();

            while (!stack.isEmpty()) {
                Integer number = stack.pop();
                if (number % divider != 0) {
                    output.append(number).append(" ");
                }
            }
            return output.toString();
        };
    }
}
