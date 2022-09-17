package JAVA_ADVANCED.Multidimensional_Arrays;

import java.util.*;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int degree = Integer.parseInt(line.substring(line.indexOf("(") + 1, line.indexOf(")")));
        Deque<String> words = new ArrayDeque<>();
        int maxRowLenght = 0;

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            int currentLength = command.length();
            words.offer(command);
            if (currentLength > maxRowLenght) {
                maxRowLenght = currentLength;
            }
            command = scanner.nextLine();
        }
        int r = words.size();
        int c = maxRowLenght;
        String[][] matrix = new String[r][c];


        for (int i = 0; i < matrix.length; i++) {
            StringBuilder tempWord = new StringBuilder(words.poll());
            if (tempWord.length() < maxRowLenght) {
                tempWord.append(" ".repeat(Math.max(0, maxRowLenght - tempWord.length())));
            }
            matrix[i] = tempWord.toString().split("");
        }
        int count = degree / 90;
        while (count > 0) {
            matrix = rotateMatrix(matrix);
            count--;
        }

        for (String[] strings : matrix) {
            for (String s : strings) {
                System.out.print(s + "");
            }
            System.out.println();
        }
    }


    private static String[][] rotateMatrix(String[][] matrix) {
        String[][] rotatedMatrix = new String[matrix[0].length][];
        for (int i = 0; i < matrix[0].length; i++) {
            StringBuilder temp = new StringBuilder();
            for (int col = matrix.length - 1; col >= 0; col--) {
                temp.append(matrix[col][i]);
            }
            rotatedMatrix[i] = temp.toString().split("");
        }
        return rotatedMatrix;
    }
}
