package JAVA_ADVANCED.Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int namesLength = Integer.parseInt(scanner.nextLine());

        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> isLessOrEqual = s -> s.length() <= namesLength;

        Arrays.stream(names).filter(isLessOrEqual).forEach(System.out::println);

    }
}
