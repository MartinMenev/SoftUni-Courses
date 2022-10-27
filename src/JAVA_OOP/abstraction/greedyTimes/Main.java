package JAVA_OOP.abstraction.greedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] items = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(capacity);

        for (int i = 0; i < items.length - 1; i += 2) {
            String type = items[i];
            int amount = Integer.parseInt(items[i + 1]);

            if (type.equalsIgnoreCase("gold")) {
                Gold gold = new Gold(amount);
                bag.addGold(gold);
            } else if (type.length() >= 4 && type.toLowerCase().endsWith("gem")) {
                Gem gem = new Gem(type, amount);
                bag.addGem(gem);
            } else if (type.length() == 3) {
                Cash cash = new Cash(type, amount);
                bag.addCash(cash);
            }
        }

        bag.printBag();
    }
}