package JAVA_OOP.polymorphism.wildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Zs");
    }

    @Override
    void eat(Food food) {
        if (!(food instanceof Vegetable)) {
            String message = String.format("%ss are not eating that type of food!", getClass().getSimpleName());
            throw new IllegalArgumentException(message);
        }

        foodEaten += food.getQuantity();
    }
}
