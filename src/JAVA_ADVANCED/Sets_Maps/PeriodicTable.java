package JAVA_ADVANCED.Sets_Maps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Set<String> compounds = new TreeSet<>();

        for (int i = 0; i < number; i++) {
            String[] inputs = scanner.nextLine().split("\\s+");
            compounds.addAll(Arrays.asList(inputs));
        }
        for (String compound : compounds) {
            System.out.print(compound + " ");
        }
    }
}
