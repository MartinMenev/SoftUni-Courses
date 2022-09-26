package JAVA_ADVANCED.Functional_Programming;

import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> comparator = (a, b) -> {
            if (a % 2 == 0 && b % 2 != 0) return -1;
            if (a % 2 != 0 && b % 2 == 0) return 1;
            else return a.compareTo(b);
        };
        numbers.sort(comparator);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
