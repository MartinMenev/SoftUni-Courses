package JAVA_ADVANCED.Streams_Files_Directories;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\inputLineNumbers.txt";
        String outputPath = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

            String nextLine = reader.readLine();

            int count = 1;
            while (nextLine != null) {
                writer.println(count + ". " + nextLine);
                count++;

                nextLine = reader.readLine();
            }
            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        }
    }
}
