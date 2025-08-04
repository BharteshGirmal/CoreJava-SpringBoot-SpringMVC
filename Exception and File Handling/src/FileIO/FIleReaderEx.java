package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class FIleReaderEx {
    public static void main(String[] args) {


        System.out.println("File Writer Example");
        String  filename = "FileWriterEx.txt";
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
