package JAVA_ADVANCED.Streams_Files_Directories;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String source1 = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\inputOne.txt";
        String source2 = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\inputTwo.txt";
        String outPath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\results.txt";

        Set<String> mergedText = new LinkedHashSet<>();

        try {
            BufferedReader readSource1 = new BufferedReader(new FileReader(source1));
            BufferedReader readSource2 = new BufferedReader(new FileReader(source2));
            PrintWriter printResult = new PrintWriter(new FileWriter(outPath));

            String nextLine = readSource1.readLine();

            while (nextLine != null) {

                mergedText.addAll(Arrays.asList(nextLine.split("\\s+")));
                nextLine = readSource1.readLine();
            }

            readSource1.close();

            nextLine = readSource2.readLine();

            while (nextLine != null) {

                mergedText.addAll(Arrays.asList(nextLine.split("\\s+")));
                nextLine = readSource2.readLine();
            }
            readSource2.close();

            for (String line : mergedText) {
                printResult.println(line);
            }
            printResult.close();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

