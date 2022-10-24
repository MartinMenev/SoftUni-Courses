package JAVA_OOP.abstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = dimensions[0];
        int col = dimensions[1];

        int[][] matrix = new int[row][col];

        createMatrix(row, col, matrix);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            markEvilPath(matrix, evilRow, evilCol);

            int jediRow = jediCoordinates[0];
            int jediCol = jediCoordinates[1];

            sum = jediPathSum(matrix, sum, jediRow, jediCol);

            command = scanner.nextLine();
        }

        System.out.println(sum);
    }

    private static long jediPathSum(int[][] matrix, long sum, int jediRow, int jediCol) {
        while (jediRow >= 0 && jediCol < matrix[0].length) {
            if (jediRow < matrix.length && jediCol >= 0) {
                sum += matrix[jediRow][jediCol];
            }

            jediCol++;
            jediRow--;
        }
        return sum;
    }

    private static void markEvilPath(int[][] matrix, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < matrix.length && evilCol < matrix[0].length) {
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static void createMatrix(int row, int col, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = value++;
            }
        }
    }
}
