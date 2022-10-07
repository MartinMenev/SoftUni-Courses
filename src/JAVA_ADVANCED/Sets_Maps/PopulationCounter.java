package JAVA_ADVANCED.Sets_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, HashMap<String, Integer>> population = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("report")) {

            String[] data = input.split("\\|");
            String country = data[1];
            String city = data[0];
            int count = Integer.parseInt(data[2]);

            population.putIfAbsent(country, new HashMap<>());
            population.get(country).put(city, count);

            input = scanner.nextLine();
        }

        population.entrySet()
                .stream()
                .sorted(
                        (e1, e2) -> getTotalPopulation(e2.getValue()).compareTo(getTotalPopulation(e1.getValue())))
                .forEach(entry -> {
                    System.out.printf("%s (total population: %d)%n", entry.getKey(), getTotalPopulation(entry.getValue()));

                            entry.getValue().entrySet().stream()
                                    .sorted( (c1, c2) -> c2.getValue() - c1.getValue())
                                    .forEach( city -> System.out.printf("=>%s: %d%n", city.getKey(), city.getValue()));

                });

    }

    private static  Integer getTotalPopulation(Map<String, Integer> cities) {
         int countryCount = 0;
            for (var city : cities.entrySet()) {  // each city
                countryCount += city.getValue();
            }

        return countryCount;

    }
}
