package JAVA_ADVANCED.Functional_Programming;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String[]> printArray = array -> {
            for (String word : array)
                System.out.println(word);
        };

        String[] input = scanner.nextLine().split("\\s+");
        printArray.accept(input);
    }
}
