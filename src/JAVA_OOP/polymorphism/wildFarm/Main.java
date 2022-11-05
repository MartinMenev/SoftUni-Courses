package JAVA_OOP.polymorphism.wildFarm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();

        while (!"End".equals(input)) {

            String[] data = input.split("\\s+");

            Animal animal = null;
            Food food;

            switch (data[0]) {
                case "Mouse" -> animal = new Mouse("Mouse", data[1], Double.parseDouble(data[2]), data[3]);
                case "Cat" -> animal = new Cat("Cat", data[1], Double.parseDouble(data[2]), data[3], data[4]);
                case "Tiger" -> animal = new Tiger("Tiger", data[1], Double.parseDouble(data[2]), data[3]);
                case "Zebra" -> animal = new Zebra("Zebra", data[1], Double.parseDouble(data[2]), data[3]);
            }

            assert animal != null;
            animal.makeSound();

            data = scanner.nextLine().split("\\s+");

            if ("Vegetable".equals(data[0])) {
                food = new Vegetable(Integer.parseInt(data[1]));
            } else {
                food = new Meat(Integer.parseInt(data[1]));
            }

            try {
                animal.eat(food);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            animals.add(animal);

            input = scanner.nextLine();
        }

        animals.forEach(System.out::println);
    }
}
