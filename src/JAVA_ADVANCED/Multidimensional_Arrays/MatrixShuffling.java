package JAVA_ADVANCED.Multidimensional_Arrays;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(tokens[0]);
        int col = Integer.parseInt(tokens[1]);
        String [][] matrix = new String[row][col];
        for (int i = 0; i < row ; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] nextCommand = command.split("\\s+");
            if (!nextCommand[0].equals("swap")) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            } else if (nextCommand.length != 5){
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            } else {
                int row1 = Integer.parseInt(nextCommand[1]);
                int col1 = Integer.parseInt(nextCommand[2]);
                int row2 = Integer.parseInt(nextCommand[3]);
                int col2 = Integer.parseInt(nextCommand[4]);

                if (isBound(matrix, row1, col1) && isBound (matrix, row2, col2)) {
                    String tempValue = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = tempValue;

                    for (String[] strings : matrix) {
                        for (String arg : strings) {
                            System.out.print(arg + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            }
            command = scanner.nextLine();

        }
    }
    private static boolean isBound(String[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
