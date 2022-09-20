package JAVA_ADVANCED.Sets_Maps;

import java.util.*;

import static java.lang.Character.isDigit;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> personCards = new LinkedHashMap<>();
        Map<Character, Integer> cardsType = new HashMap<>();
        cardsType.put('J', 11);
        cardsType.put('Q', 12);
        cardsType.put('K', 13);
        cardsType.put('A', 14);

        Map<Character, Integer> cardPower = new HashMap<>();
        cardPower.put('S', 4);
        cardPower.put('H', 3);
        cardPower.put('D', 2);
        cardPower.put('C', 1);

        String input = scanner.nextLine();
        Map<String, List<String>> uniqueCards = new HashMap<>();

        while (!input.equals("JOKER")) {


            String name = input.split(":\\s+")[0];
            personCards.putIfAbsent(name, 0);
            uniqueCards.putIfAbsent(name, new ArrayList<>());
            String[] currentCards = input.split(":\\s+")[1].split(",\\s+");

            for (String currentCard : currentCards) {
                if (!uniqueCards.get(name).contains(currentCard)) {
                    uniqueCards.get(name).add(currentCard);
                    int currentValue;
                    int currentPower;

                    if (currentCard.length() == 2) {
                        char firstSymbol = currentCard.charAt(0);
                        char secondSymbol = currentCard.charAt(1);
                        if (isDigit(firstSymbol)) {
                            currentValue = Integer.parseInt(String.valueOf(firstSymbol));
                        } else {
                            currentValue = cardsType.get(firstSymbol);
                        }
                        currentPower = cardPower.get(secondSymbol);
                    } else {
                        currentValue = Integer.parseInt(""+ currentCard.charAt(0)+ currentCard.charAt(1));
                        currentPower = cardPower.get(currentCard.charAt(2));
                    }
                    personCards.put(name, personCards.get(name) + (currentValue * currentPower));
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : personCards.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
