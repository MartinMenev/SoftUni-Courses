package JAVA_OOP.interfacesAndAbstraction.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthableList = new ArrayList<>();


        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] inputData = input.split("\\s+");
            String name = inputData[1];


            switch (inputData[0]) {
                case "Citizen":
                    int age = Integer.parseInt(inputData[2]);
                    String id = inputData[3];
                    String birthDate = inputData[4];

                    Citizen citizen = new Citizen(name, age, id, birthDate);
                    birthableList.add(citizen);
                    break;
                case "Pet":
                    birthDate = inputData[2];

                    Pet pet = new Pet(name, birthDate);
                    birthableList.add(pet);
                    break;
                case "Robot":
                    Robot robot = new Robot(inputData[1], inputData[2]);
                    break;
            }
            input = scanner.nextLine();
        }

        String searchedYear = scanner.nextLine();

        birthableList
                .stream()
                .filter(c -> c.getBirthDate().endsWith(searchedYear))
                .forEach(c -> System.out.println(c.getBirthDate()));

    }
}
