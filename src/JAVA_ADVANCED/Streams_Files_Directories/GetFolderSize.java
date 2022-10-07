package JAVA_ADVANCED.Streams_Files_Directories;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFolderSize {
    public static void main(String[] args) {

        String address = "D:\\Java Programming 2022\\JAVA ADVANCED\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        Path path = Paths.get(address);
        File file = new File(path.toUri());

        if (file.isDirectory())
        System.out.println("Folder size: "+ file.length());
    }
}
