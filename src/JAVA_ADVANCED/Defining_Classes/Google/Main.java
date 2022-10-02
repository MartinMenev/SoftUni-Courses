package JAVA_ADVANCED.Defining_Classes.Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Person> personMap = new HashMap<>();

        while (!input.equals("End")) {
            String[] line = input.split("\\s+");
            String name = line[0];
            String infoType = line[1];
            String data1 = line[2];
            String data2 = line[3];

            personMap.putIfAbsent(name, new Person(name));

            switch (infoType) {
                case "company" -> {
                    double data3 = Double.parseDouble(line[4]);
                    Company company = new Company(data1, data2, data3);
                    personMap.get(name).setCompany(company);
                }
                case "pokemon" -> {
                    Pokemon pokemon = new Pokemon(data1, data2);
                    if (personMap.get(name).getPokemonList() == null)
                        personMap.get(name).setPokemonList(new ArrayList<>());
                    personMap.get(name).getPokemonList().add(pokemon);
                }
                case "parents" -> {
                    Parent parent = new Parent(data1, data2);
                    if (personMap.get(name).getParentList() == null) {
                        personMap.get(name).setParentList(new ArrayList<>());

                        personMap.get(name).getParentList().add(parent);
                    }
                }
                case "children" -> {
                    Child child = new Child(data1, data2);
                    if (personMap.get(name).getChildList() == null) {
                        personMap.get(name).setChildList(new ArrayList<>());

                        personMap.get(name).getChildList().add(child);
                    }
                }
                case "car" -> {
                    Car car = new Car(data1, data2);
                    personMap.get(name).setCar(car);
                }
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        personMap.get(input).printPerson(personMap.get(input));
    }
}
