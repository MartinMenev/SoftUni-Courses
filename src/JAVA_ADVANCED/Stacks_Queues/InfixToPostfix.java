package JAVA_ADVANCED.Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            Character symbol = tokens[i].charAt(0);
            if (isDigit(symbol)) {
                queue.offer(symbol);
            } else {
                stack.push(symbol);
            }
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        for (Character character : queue) {
            System.out.print(queue.poll() + " ");
        }
    }
}
