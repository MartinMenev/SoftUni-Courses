package JAVA_ADVANCED.Iterators_Comparators.stackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Stack<Integer> stack = new Stack<>();

        while (!input.equals("END")) {
            if (input.equals("Pop")) {
                stack.pop();

            } else {
                String line = input.substring(5).trim();
                Integer[] elements = new Integer[line.split(", ").length];
                for (int i = 0; i < elements.length; i++) {
                    elements[i] = Integer.parseInt(line.split(", ")[i]);
                }
                stack.push(elements);
            }

            input = scanner.nextLine();
        }
        stack.print();
        stack.print();
    }
}
