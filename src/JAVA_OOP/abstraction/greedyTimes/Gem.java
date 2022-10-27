package JAVA_OOP.abstraction.greedyTimes;

import java.util.Locale;

public class Gem {
    private String name;
    private int amount;

    public Gem(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("##%s - %d", name, amount);
    }
}
