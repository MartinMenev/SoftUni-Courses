package JAVA_OOP.inheritance.restaurant;

import java.math.BigDecimal;

public class Product {
    protected String name;
    protected BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
