package JAVA_ADVANCED.ExamTasks.TreasureHunt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        String[][] map = new String[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = scanner.nextLine().split(" ");
        }
        int currentRow = -1;
        int currentCol = -1;

        List<String> steps = new ArrayList<>();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals("Y")) {
                    currentRow = i;
                    currentCol = j;
                }
            }
        }

        String command = scanner.nextLine();


        while (!command.equals("Finish")) {
            switch (command) {
                case "up":
                    if (isBound(map, currentRow - 1, currentCol)) {
                        if (!map[currentRow - 1][currentCol].equals("T")) {
                            currentRow -= 1;
                            steps.add(command);
                        }
                    }
                    break;
                case "down":
                    if (isBound(map, currentRow + 1, currentCol)) {
                        if (!map[currentRow + 1][currentCol].equals("T")) {
                            currentRow += 1;
                            steps.add(command);
                        }
                    }
                    break;
                case "left":
                    if (isBound(map, currentRow, currentCol -1)) {
                        if (!map[currentRow][currentCol - 1].equals("T"))  {
                            currentCol -= 1;
                            steps.add(command);
                        }
                    }
                    break;
                case "right":
                    if (isBound(map, currentRow, currentCol + 1)) {
                        if (!map[currentRow][currentCol + 1].equals("T")) {
                            currentCol += 1;
                            steps.add(command);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        boolean treasureFound = map[currentRow][currentCol].equals("X");
        if (!treasureFound) {
            System.out.println("The map is fake!");
        } else {
            System.out.println("I've found the treasure!");
            System.out.print("The right path is ");
            System.out.println(String.join(", ", steps));
        }
    }

    private static boolean isBound (String[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}


