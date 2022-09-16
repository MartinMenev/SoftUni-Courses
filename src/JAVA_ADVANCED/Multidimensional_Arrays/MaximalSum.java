package JAVA_ADVANCED.Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int row = arr[0];
        int col = arr[1];

        int[][] matrix = new int[row][col];
        int[][] maxSumMatrix = new int[3][3];
        int[][] currentMatrix = new int[3][3];

        //reading the console matrix:
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            int[] currentRow = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = currentRow;
        }

        //iteration through the given matrix:
        for (int row1 = 0; row1 < row - 2; row1++) {
            for (int col1 = 0; col1 < col - 2; col1++) {
                int currentSum = 0;

                // filling the test matrix:

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        currentMatrix[i][j] = matrix[row1 + i][col1 + j];
                        currentSum += currentMatrix[i][j];
                    }
                }

                // checking if current text matrix is with max sum:
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                        // storing the matrix with max sum so far:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            maxSumMatrix[i][j] = currentMatrix[i][j];
                        }
                    }
                }
            }
        }
        System.out.println("Sum = " + maxSum);

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(maxSumMatrix[k][l] + " ");
            }
            System.out.println();
        }
    }
}
