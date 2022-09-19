package JAVA_ADVANCED.Sets_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phonebook = new HashMap<>();

        while (!input.equals("search")) {
            phonebook.put(input.split("-")[0],input.split("-")[1]);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("stop")) {

            System.out.println(phonebook.containsKey(input)
                                ? input + " -> " + phonebook.get(input)
                                : "Contact " + input + " does not exist.");

            input = scanner.nextLine();
        }
    }
}
