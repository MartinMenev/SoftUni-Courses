package JAVA_OOP.polymorphism.wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat ds = new DecimalFormat("###,###.##");
        return String.format("%s[%s, %s, %s, %s]", animalType, animalName, ds.format(animalWeight), livingRegion, foodEaten);
    }
}
