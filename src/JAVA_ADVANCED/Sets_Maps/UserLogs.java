package JAVA_ADVANCED.Sets_Maps;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Integer>> usernameLog = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String ipAddress = input.substring(3, input.indexOf("message=") - 1);
            String username = input.substring(input.indexOf("user=") + 5);

            usernameLog.putIfAbsent(username, new LinkedHashMap<>());
            usernameLog.get(username).putIfAbsent(ipAddress, 0);
            usernameLog.get(username).put(ipAddress, usernameLog.get(username).get(ipAddress) + 1);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : usernameLog.entrySet()) {
            System.out.println(entry.getKey() + ":");
            String values = "";
            List <String> tempValue = new ArrayList<>();
            for (Map.Entry<String, Integer> ipAddress : entry.getValue().entrySet()) {
                tempValue.add( ipAddress.getKey() + " => " + ipAddress.getValue());
                values = String.join(", ", tempValue);
            }
            System.out.println(values + ".");
        }
    }
}

