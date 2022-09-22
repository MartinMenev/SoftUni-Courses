package JAVA_ADVANCED.Streams_Files_Directories;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\input.txt";
        String outputPath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

        String line = reader.readLine();

        while (line!= null) {
            String lineText = line.toUpperCase();

            writer.println(lineText);

            line = reader.readLine();
        }
        writer.close();
    }
}