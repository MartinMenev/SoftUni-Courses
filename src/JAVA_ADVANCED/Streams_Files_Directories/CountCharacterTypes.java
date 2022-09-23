package JAVA_ADVANCED.Streams_Files_Directories;

import java.io.*;
import java.util.*;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\input.txt";
        String outputPath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

        String line = reader.readLine();

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;

        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        List<Character> punctuation = new ArrayList<>(Arrays.asList('!', ',', '.', '?'));

        while (line!= null) {
            char[] lineText = line.toCharArray();

            for (char symbol : lineText) {
                if (vowels.contains(symbol)) {
                    vowelsCount++;
                } else if (punctuation.contains(symbol)) {
                    punctuationCount++;
                } else if (symbol != 32) {
                    consonantsCount++;
                }
            }

            line = reader.readLine();
        }
        writer.println("Vowels: " + vowelsCount);
        writer.println("Consonants: " + consonantsCount);
        writer.println("Punctuation: " + punctuationCount);

        writer.close();
    }
}
