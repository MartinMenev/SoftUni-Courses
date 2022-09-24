package JAVA_ADVANCED.Streams_Files_Directories;

import java.io.*;

public class CopyPicture {
    public static void main(String[] args) throws IOException {
        String source = "src/JAVA_ADVANCED/Streams_Files_Directories/cat.jpg";
        String outputAddress = "src/JAVA_ADVANCED/Streams_Files_Directories/picture-copy.jpg";

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(outputAddress);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            assert is != null;
            is.close();
            assert os != null;
            os.close();
        }
    }
}
