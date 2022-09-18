package JAVA_ADVANCED.Sets_Maps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int firstSetLength = Integer.parseInt(input[0]);
        int secondSetLength = Integer.parseInt(input[1]);
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set <Integer> secondSet = new LinkedHashSet<>();
        Set <Integer> result = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < secondSetLength; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        for (Integer integer : firstSet) {
            if (secondSet.contains(integer)) {
                result.add(integer);
            }
        }

        for (Integer integer : secondSet) {
            if (firstSet.contains(integer)) {
                result.add(integer);
            }
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
