package JAVA_ADVANCED.Functional_Programming;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String[]> printSirName = array -> {
            for (String word : array)
                System.out.println("Sir " + word);
        };

        String[] input = scanner.nextLine().split("\\s+");
        printSirName.accept(input);

    }
}
