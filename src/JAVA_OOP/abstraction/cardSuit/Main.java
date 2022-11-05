package JAVA_OOP.abstraction.cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input + ":");
        for (Suit values : Suit.values()) {
            System.out.printf("Ordinal value: %s; Name value: %s%n", values.getValue(), values.name());
        }
    }
}
