package JAVA_ADVANCED.Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        ArrayDeque <String> unDoes = new ArrayDeque<>();

        int numberOperations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOperations; i++) {
            String[] command = scanner.nextLine().split(" ");
            int currentCommand = Integer.parseInt(command[0]);
            switch (currentCommand) {
                case 1:
                    String input = command[1];
                    text.append(input);
                    unDoes.push(input);
                    break;
                case 2:
                    int count = Integer.parseInt(command[1]);

                        String textToErase = text.substring(text.length() - count, text.length());
                        unDoes.push(textToErase);
                        text = new StringBuilder(text.replace(text.length() - count, text.length(),""));

                    break;
                case 3:
                    count = Integer.parseInt(command[1]);
                    System.out.println(text.charAt(count -1));
                    break;
                case 4:
                    text = new StringBuilder(unDoes.pop());
                    break;
            }
        }
    }
}
