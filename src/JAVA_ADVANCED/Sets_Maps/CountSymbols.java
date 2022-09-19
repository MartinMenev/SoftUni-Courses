package JAVA_ADVANCED.Sets_Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map <Character, Integer> charactersMap = new TreeMap<>();
        for (char symbol : input.toCharArray()) {
            charactersMap.putIfAbsent(symbol, 0);
            charactersMap.put(symbol, charactersMap.get(symbol) + 1);
        }
        for (Map.Entry<Character, Integer> symbol : charactersMap.entrySet()) {
            System.out.println(symbol.getKey() + ": " + symbol.getValue() + " time/s");
        }
    }
}
