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

    public static class ParkingSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] input = scanner.nextLine().split("\\s+");
            int row = Integer.parseInt(input[0]);
            int col = Integer.parseInt(input[1]);

            int[][] parking = new int[row][col];

            String command = scanner.nextLine();

            while (!command.equals("stop")) {
                String[] nextLine = command.split("\\s+");
                int entryRow = Integer.parseInt(nextLine[0]);
                int desiredRow = Integer.parseInt(nextLine[1]);
                int desiredCol = Integer.parseInt(nextLine[2]);
                boolean hasParked = false;
                int distance = 1;

                int currentCol = 0;

                distance = Math.abs(entryRow - desiredRow) + 1;


                distance += desiredCol;

                if (parking[desiredRow][desiredCol] == 0) {
                    parking[desiredRow][desiredCol] = 1;
                    System.out.println(distance);
                    hasParked = true;
                } else {
                    hasParked = isHasParked(col, parking, desiredRow, desiredCol, hasParked, distance);
                }

                if (!hasParked) {
                    System.out.printf("Row %d full%n", desiredRow);
                }
                command = scanner.nextLine();
            }
        }

        private static boolean isHasParked(int col, int[][] parking, int desiredRow, int desiredCol, boolean hasParked, int distance) {
            for (int i = 1; i < col; i++) {
                if (isBound(desiredCol - i, col)) {
                    if (parking[desiredRow][desiredCol - i] == 0) {
                        parking[desiredRow][desiredCol - i] = 1;
                        distance -= i;
                        System.out.println(distance);
                        hasParked = true;
                        break;
                    } else if (isBound(desiredCol + i, col)) {
                        if (parking[desiredRow][desiredCol + i] == 0) {
                            parking[desiredRow][desiredCol + i] = 1;
                            distance += i;
                            System.out.println(distance);
                            hasParked = true;
                            break;
                        }
                    }
                }
            }
            return hasParked;
        }

        private static boolean isBound(int i, int col) {
            return i >= 1 && i < col;
        }
    }
}
