package JAVA_ADVANCED.Defining_Classes.PokemonTrainer;

import java.util.List;

public class Trainer {
    private String name;
    private int numberBadges = 0;
    private List<Pokemon> pokemonList;

    public Trainer(String name, List<Pokemon> pokemonList) {
        this.name = name;
        this.pokemonList = pokemonList;
    }

    public void hasOnePokemon (String element) {

        if (!this.getPokemonList().isEmpty()) {
            boolean isFound = false;

            for (Pokemon pokemon : getPokemonList()) {
                if (pokemon.getElement().equals(element)) {
                    numberBadges++;
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                for (Pokemon pokemon : getPokemonList()) {
                    pokemon.setHealth(pokemon.getHealth() - 10);
                    if (pokemon.getHealth() <= 0) {
                        pokemonList.remove(pokemon);
                        if (pokemonList.isEmpty())
                           return;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        if (!pokemonList.isEmpty()) {
            return  name + " " + numberBadges + " " + getPokemonList().size();
        }
        return name + " " + numberBadges + " 0";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberBadges() {
        return numberBadges;
    }

    public void setNumberBadges(int numberBadges) {
        this.numberBadges = numberBadges;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
