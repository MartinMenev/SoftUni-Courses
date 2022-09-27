package JAVA_ADVANCED.Functional_Programming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
        		.collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("Party!")) {
            String[] element = command.split("\\s+");
            String actionType = element[0];
            String checkType = element[1];
            String criteria = element[2];

            Predicate<String> startsCheck = text -> text.startsWith(criteria);
            Predicate<String> endsCheck = text -> text.endsWith(criteria);
            Predicate<String> lengthCheck = text -> text.length() == Integer.parseInt(criteria);

            if (actionType.equals("Remove")) {

                removeCommand(guests, checkType, startsCheck, endsCheck, lengthCheck);

            } else if (actionType.equals("Double")) {

                doubleCommand(guests, checkType, startsCheck, endsCheck, lengthCheck);
            }
            command = scanner.nextLine();
        }

        if (guests.isEmpty()) System.out.println("Nobody is going to the party!");
        else {
            guests.sort(String::compareTo);
            System.out.print((String.join(", ",guests)) + " are going to the party!");
        }
    }

    private static void doubleCommand (List<String> guests, String checkType, Predicate<String> startsCheck, Predicate<String> endsCheck, Predicate<String> lengthCheck) {
        switch (checkType) {
            case "StartsWith":
                for (int i = 0; i < guests.size(); i++) {
                    if (startsCheck.test(guests.get(i))) {
                        guests.add(0, guests.get(i++));
                    }
                }
                break;
            case "EndsWith":
                for (int i = 0; i < guests.size(); i++) {
                    if (endsCheck.test(guests.get(i))) {
                        guests.add(0, guests.get(i++));
                    }

                }
                break;
            case "Length":
                for (int i = 0; i < guests.size(); i++) {
                    if (lengthCheck.test(guests.get(i)))
                        guests.add(0, guests.get(i++));
                }
                break;
        }
    }

    private static void removeCommand (List<String> guests, String checkType, Predicate<String> startsCheck, Predicate<String> endsCheck, Predicate<String> lengthCheck) {
        switch (checkType) {
            case "StartsWith" -> guests.removeIf(startsCheck);
            case "EndsWith" -> guests.removeIf(endsCheck);
            case "Length" -> guests.removeIf(lengthCheck);
        }
    }
}
