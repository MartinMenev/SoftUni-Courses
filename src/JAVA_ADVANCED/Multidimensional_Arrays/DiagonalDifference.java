package JAVA_ADVANCED.Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[num][num];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < num; i++) {

            int[] arr = Arrays
             .stream(scanner.nextLine().split(" "))
             .mapToInt(Integer::parseInt).toArray();
            matrix [i] = arr;
        }

        for (int i = 0; i < num; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[num -1 - i][i];
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}
