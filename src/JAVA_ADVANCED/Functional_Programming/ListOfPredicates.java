package JAVA_ADVANCED.Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  number = Integer.parseInt(scanner.nextLine());

        int[] arr = Arrays
         .stream(scanner.nextLine().split(" "))
         .mapToInt(Integer::parseInt).toArray();

        for (int i = 1; i <= number; i++) {

                Predicate<Integer> isDivisible = n-> {
                    for (int i1 : arr) {
                        if (n % i1 != 0) {
                            return false;
                        }
                    }
                    return true;
                };
            if (isDivisible.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
