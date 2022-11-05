package JAVA_OOP.polymorphism.wildFarm;

public class Mouse extends Mammal{
    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
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
