package JAVA_ADVANCED.Streams_Files_Directories;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {

        String sourcePath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\words.txt";
        String textPath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\text.txt";
        String outPath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\results.txt";

        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        try {
            BufferedReader readSource = new BufferedReader( new FileReader(sourcePath));
            BufferedReader readText = new BufferedReader( new FileReader(textPath));
            PrintWriter printResult = new PrintWriter( new FileWriter(outPath));

            String nextLine = readSource.readLine();

            while (nextLine != null) {

                for (String word : nextLine.split("\\s+")) {

                    wordsCount.putIfAbsent(word, 0);
                }
                nextLine = readSource.readLine();
            }

            nextLine = readText.readLine();

            while (nextLine != null) {

                for (String word : nextLine.split("\\s+")) {

                    if (wordsCount.containsKey(word)) {
                        wordsCount.put(word, wordsCount.get(word) + 1);
                    }
                }
                nextLine = readSource.readLine();
            }
            readText.close();

            wordsCount.entrySet()
                    .stream()
                    .sorted(
                            (w1, w2) -> w2.getValue().compareTo(w1.getValue()))
                    .forEach(e -> printResult.println(e.getKey() + " - " + e.getValue()));

            printResult.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
