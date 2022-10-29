package JAVA_OOP.encapsulation.pizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setWeight(weight);
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalStateException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")) {
            throw new IllegalStateException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalStateException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories () {
        return 2 * weight * TypeDoughModifier.valueOf(flourType).getModifier() * TechniqueDoughModifier.valueOf(bakingTechnique).getModifier();
    }
}
