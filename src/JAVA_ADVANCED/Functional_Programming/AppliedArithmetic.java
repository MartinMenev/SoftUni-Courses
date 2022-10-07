package JAVA_ADVANCED.Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], int[]> add = arr -> {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += 1;
            }
            return arr;
        };

        Function<int[], int[]> multiply = arr -> {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * 2;
            }
            return arr;
        };

        Function<int[], int[]> subtract = arr -> {
            for (int i = 0; i < arr.length; i++) {
                arr[i] -= 1;
            }
            return arr;
        };

        Consumer<int[]> print = arr -> Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            switch (command) {
                case "add":
                    add.apply(numbers);
                    break;
                case "multiply":
                    multiply.apply(numbers);
                    break;
                case "subtract":
                    subtract.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
            }
            command = scanner.nextLine();
        }

    }
}
