package JAVA_ADVANCED.Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = Integer.parseInt(scanner.nextLine());
        ArrayDeque <Long> fibonacci = new ArrayDeque<>();

        fibonacci.offer(1L);
        fibonacci.offer(1L);
        int counter = 2;
        while (counter <= 49) {
            long previousNum = fibonacci.pollLast();
            long nextNum = previousNum + fibonacci.peekLast();
            fibonacci.offer(previousNum);
            fibonacci.offer(nextNum);
            counter++;
        }

        for (int i = 0; i < number; i++) {
            fibonacci.poll();
        }
        System.out.println(fibonacci.poll());
    }
}
