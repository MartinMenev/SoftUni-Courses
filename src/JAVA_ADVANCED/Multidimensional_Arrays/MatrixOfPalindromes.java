package JAVA_ADVANCED.Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
         .stream(scanner.nextLine().split(" "))
         .mapToInt(Integer::parseInt).toArray();

        int rowCount = arr [0];
        int columnCount = arr [1];
        String [][] matrix = new String[rowCount][columnCount];

        //filling matrix:
        for (int row = 0; row < rowCount ; row++) {
            for (int column = 0; column < columnCount; column++) {
                char first = (char) (row + 97);
                char second = (char) (column + row + 97);
                char third = (char) (row + 97);
                matrix [row][column] = ""+ first +""+ second +""+ third;
            }
        }
        // printing matrix:
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
