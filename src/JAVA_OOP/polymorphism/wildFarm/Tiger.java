package JAVA_OOP.polymorphism.wildFarm;

public class Tiger extends Felime{

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if (!(food instanceof Meat)) {
            String message = String.format("%ss are not eating that type of food!", getClass().getSimpleName());
            throw new IllegalArgumentException(message);
        }

        foodEaten += food.getQuantity();
    }
}
