package JAVA_ADVANCED.Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.max;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < num; i++) {
          int [] tokens = Arrays
                  .stream(scanner.nextLine().split(" "))
                  .mapToInt(Integer::parseInt)
                  .toArray();


            switch (tokens[0]) {
                case 1: stack.push(tokens[1]);
                break;
                case 2: stack.pop();
                break;
                case 3: System.out.println(max(stack));
            }
        }
    }
}
