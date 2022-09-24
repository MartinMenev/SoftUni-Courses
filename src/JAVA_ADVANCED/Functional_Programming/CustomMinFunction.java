package JAVA_ADVANCED.Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], Integer> minValue = array -> {
            int min = Integer.MAX_VALUE;
            for (Integer x : array) {
                if (x < min) {
                    min = x;
                }
            }
            return min;
        };

        int min  = minValue.apply(Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray());

        System.out.println(min);
    }
}
