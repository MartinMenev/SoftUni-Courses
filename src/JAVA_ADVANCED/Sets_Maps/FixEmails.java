package JAVA_ADVANCED.Sets_Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emailsMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            emailsMap.put(input, scanner.nextLine());
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : emailsMap.entrySet()) {
            String substring = entry.getValue().substring(entry.getValue().toLowerCase().lastIndexOf(".") +1);
            if (!substring.equals("us") && !substring.equals("uk") && !substring.equals("com")) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
