package JAVA_OOP.encapsulation.shoppingSpree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Person> peopleList = new LinkedHashMap<>();
        Map<String, Product> productList = new HashMap<>();

        String[] people = scanner.nextLine().split(";");
        for (String person : people) {
            String[] personalData = person.split("=");
            try {
                Person currentPerson = new Person(personalData[0], Double.parseDouble(personalData[1]));
                peopleList.put(personalData[0], currentPerson);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] products = scanner.nextLine().split(";");
        for (String product : products) {
            String[] productData = product.split("=");
            try {
                Product currentProduct = new Product(productData[0], Double.parseDouble(productData[1]));
                productList.put(productData[0], currentProduct);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String name = command.split("\\s+")[0];
            String product = command.split("\\s+")[1];

            try {
                peopleList.get(name).buyProduct(productList.get(product));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            command = scanner.nextLine();
        }

        for (Person person : peopleList.values()) {
            System.out.println(person);
        }
    }
}
