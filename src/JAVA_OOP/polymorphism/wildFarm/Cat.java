package JAVA_OOP.polymorphism.wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat (String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food) {
        foodEaten += food.getQuantity();
    }

    @Override
    public String toString() {
        DecimalFormat ds = new DecimalFormat("###,###.##");
        return String.format("%s[%s, %s, %s, %s, %d]", animalType, animalName, breed, ds.format(animalWeight), livingRegion, foodEaten);
    }
}
