package JAVA_ADVANCED.Multidimensional_Arrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int matrixSize = Integer.parseInt(input[0]);
        String matrixType = input[1];


        if (matrixType.equals("A")) {
            fillMatrixA(matrixSize);
        } else if (matrixType.equals("B")) {
            fillMatrixB(matrixSize);
        }
    }

    private static void fillMatrixB(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int column = 0; column < matrixSize; column++) {
            if (column % 2 == 0) {
                for (int row = 0; row < matrixSize; row++) {
                    matrix[row][column] = column * matrixSize + row + 1;
                }
            } else {
                for (int row = 0; row < matrixSize; row++) {
                    matrix[row][column] = column * matrixSize + matrixSize - row;
                }
            }

        }

        // printing matrix:
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixA(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int column = 0; column < matrixSize; column++) {
            for (int row = 0; row < matrixSize; row++) {
                matrix[row][column] = column * matrixSize + row + 1;
            }
        }

        // printing matrix:
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


