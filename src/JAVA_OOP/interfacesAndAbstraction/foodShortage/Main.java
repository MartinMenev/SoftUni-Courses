package JAVA_OOP.interfacesAndAbstraction.foodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPeople = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyerMap = new HashMap<>();



        while (numberPeople-- > 0) {
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");
            String name = inputData[0];
            int age = Integer.parseInt(inputData[1]);

            if(inputData.length == 4) {
                String id = inputData[2];
                String birthDate = inputData[3];
                Citizen citizen = new Citizen (name, age, id, birthDate);
                buyerMap.put(name, citizen);
            } else {
                String group = inputData[2];
                Rebel rebel = new Rebel(name, age, group);
                buyerMap.put(name, rebel);
            }
        }

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            if (buyerMap.containsKey(input)) {
                buyerMap.get(input).buyFood();
            }
            input = scanner.nextLine();
        }

        System.out.println(buyerMap.values().stream().mapToInt(Buyer::getFood).sum());
    }
}
