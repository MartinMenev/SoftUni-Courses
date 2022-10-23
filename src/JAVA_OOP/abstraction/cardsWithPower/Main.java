package JAVA_OOP.abstraction.cardsWithPower;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        int rankValue = CardRank.valueOf(rank).getValue();
        int suitValue = Suit.valueOf(cardSuit).getValue();

            System.out.printf("Card name: %s of %s; Card power: %d", rank, cardSuit, rankValue + suitValue);
    }
}
