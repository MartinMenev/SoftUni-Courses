package JAVA_OOP.encapsulation.pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split("\\s+");
        String name = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);
        String[] doughData = scanner.nextLine().split("\\s+");
        String type = doughData[1];
        String technique = doughData[2];
        double doughWeight = Double.parseDouble(doughData[3]);


        try {
            Pizza myPizza = new Pizza(name, numberOfToppings);
            Dough dough = new Dough(type, technique, doughWeight);
            myPizza.setDough(dough);

            String nextLine = scanner.nextLine();

            while (!nextLine.equals("END")) {
                String toppingType = nextLine.split("\\s+")[1];
                double toppingWeight = Double.parseDouble(nextLine.split("\\s+")[2]);


                    Topping topping = new Topping(toppingType, toppingWeight);
                    myPizza.addTopping(topping);


                nextLine = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%n", name, myPizza.getOverallCalories());

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
