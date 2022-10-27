package JAVA_OOP.abstraction.greedyTimes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bag {
    private long capacity;
    private List<Cash> cashList;
    private List<Gold> goldList;
    private List<Gem> gemList;


    public Bag(long capacity) {
        this.capacity = capacity;
        this.cashList = new ArrayList<>();
        this.gemList = new ArrayList<>();
        this.goldList = new ArrayList<>();
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public List<Cash> getCashList() {
        return cashList;
    }

    public void setCashList(List<Cash> cashList) {
        this.cashList = cashList;
    }

    public List<Gold> getGoldList() {
        return goldList;
    }

    public void setGoldList(List<Gold> goldList) {
        this.goldList = goldList;
    }

    public List<Gem> getGemList() {
        return gemList;
    }

    public void setGemList(List<Gem> gemList) {
        this.gemList = gemList;
    }

    public void printBag() {
        if (!goldList.isEmpty()) {
            int sum = 0;
            for (Gold gold : goldList) {
                sum += gold.getAmount();
            }
            System.out.printf("<Gold> $%d%n", sum);
            System.out.printf("##Gold - %d%n", sum);
        }

        if (!gemList.isEmpty()) {
            int sum = 0;
            for (Gem gem : gemList) {
                sum += gem.getAmount();
            }
            System.out.printf("<Gem> $%d%n", sum);
            gemList.stream()
                    .sorted(Comparator.comparing(Gem::getName)
                            .reversed()
                            .thenComparing(Gem::getAmount))
                    .forEach(System.out::println);
        }

        if (!cashList.isEmpty()) {
            int sum = 0;
            for (Cash cash : cashList) {
                sum += cash.getAmount();
            }
            System.out.printf("<Cash> $%d%n", sum);
            cashList.stream()
                    .sorted(Comparator.comparing(Cash::getName)
                            .reversed()
                            .thenComparing(Cash::getAmount))
                    .forEach(System.out::println);
        }
    }

    private boolean isSpaceInBag() {
        int sum = 0;
        sum += goldList.stream().mapToInt(Gold::getAmount).sum();
        sum += gemList.stream().mapToInt(Gem::getAmount).sum();
        sum += cashList.stream().mapToInt(Cash::getAmount).sum();

        return sum <= capacity;
    }

    public void addGold(Gold gold) {
        goldList.add(gold);
        if (!isProportionRuleKept() || !isSpaceInBag()) {
            goldList.remove(gold);
        }
    }

    public void addGem(Gem gem) {
        boolean existingName = false;
        for (Gem gem1 : gemList) {
            if (gem1.getName().equalsIgnoreCase(gem.getName())) {
                existingName = true;
                gem1.setAmount(gem1.getAmount() + gem.getAmount());
                if (!isProportionRuleKept() || !isSpaceInBag()) {
                    gem1.setAmount(gem1.getAmount() - gem.getAmount());
                }
            }
        }
        if (!existingName){
            gemList.add(gem);
            if (!isProportionRuleKept() || !isSpaceInBag()) {
                gemList.remove(gem);
            }
        }

    }

    public void addCash(Cash cash) {
        boolean existingName = false;
        for (Cash cash1 : cashList) {
            if (cash1.getName().equals(cash.getName())) {
                existingName = true;
                cash1.setAmount(cash1.getAmount() + cash.getAmount());
                if (!isProportionRuleKept() || !isSpaceInBag()) {
                    cash1.setAmount(cash1.getAmount() - cash.getAmount());
                }
            }
        }
        if (!existingName){
            cashList.add(cash);
            if (!isProportionRuleKept() || !isSpaceInBag()) {
                cashList.remove(cash);
            }
        }
    }

    public boolean isProportionRuleKept() {
        int sumGold = goldList.stream().mapToInt(Gold::getAmount).sum();
        int sumGem = gemList.stream().mapToInt(Gem::getAmount).sum();
        int sumCash = cashList.stream().mapToInt(Cash::getAmount).sum();
        return sumGold >= sumGem && sumGem >= sumCash;

    }
}
