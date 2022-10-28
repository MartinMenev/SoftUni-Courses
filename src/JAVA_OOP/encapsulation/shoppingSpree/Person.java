package JAVA_OOP.encapsulation.shoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = money;
        }
    }

    public String getName() {
        return this.name;
    }

    public void buyProduct(Product product) {
        if (money >= product.getCost()) {
            System.out.printf("%s bought %s%n", name, product.getName());
            this.products.add(product);
            money -= product.getCost();
        } else {
            String message = String.format("%s can't afford %s%n", name, product.getName());
            throw new IllegalArgumentException(message);
        }
    }

    @Override
    public String toString() {
        if (this.products.isEmpty()) {
            return String.format("%s – Nothing bought", name);
        }
        List<String> productnames = new ArrayList<>();
        for (Product product : products) {
            productnames.add(product.getName());
        }
        return String.format("%s - %s", name, String.join(", ", productnames));
    }
}

