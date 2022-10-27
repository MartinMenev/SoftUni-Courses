package JAVA_OOP.abstraction.greedyTimes;

public class Cash {
    private final String name;
    private int amount;

    public Cash(String name, int amount) {
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
