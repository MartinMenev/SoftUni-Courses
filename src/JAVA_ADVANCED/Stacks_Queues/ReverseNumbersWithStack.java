package JAVA_ADVANCED.Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");
                ArrayDeque <String> stack = new ArrayDeque<>();

        for (String s : text) {
            stack.push(s);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
