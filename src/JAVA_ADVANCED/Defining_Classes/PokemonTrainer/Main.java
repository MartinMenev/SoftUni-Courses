package JAVA_ADVANCED.Defining_Classes.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String,Trainer> trainerMap = new LinkedHashMap<>();

        while (!input.equals("Tournament")){
            String[]data = input.split("\\s+");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (trainerMap.containsKey(trainerName)) {
                trainerMap.get(trainerName).getPokemonList().add(pokemon);
            } else {
                Trainer trainer = new Trainer(trainerName, new ArrayList<>());
                trainer.getPokemonList().add(pokemon);
                trainerMap.put(trainerName, trainer);
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {
            String element = input;

            for (Trainer trainer : trainerMap.values()) {

                trainer.hasOnePokemon(element);
            }
            input = scanner.nextLine();
        }

        trainerMap.values()
                .stream()
                .sorted(Comparator.comparing(Trainer::getNumberBadges).reversed())
                .forEach(System.out::println);
    }
}
