package JAVA_ADVANCED.Streams_Files_Directories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\marti\\IdeaProjects\\SoftUni\\src\\JAVA_ADVANCED\\Streams_Files_Directories\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = reader.readLine();
        long sum = 0;

        while (line!= null) {
            for (char c : line.toCharArray())
                sum +=c;

            line = reader.readLine();
        }
        System.out.println(sum);
    }
}
