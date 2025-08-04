package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

    public static void main(String[] args) {


        System.out.println("File Writer Example");
        String  filename = "FileWriterEx.txt";
        try(FileWriter writer = new FileWriter(filename)){
            writer.write("File Writer");
            for (int i = 0; i <10 ; i++) {
                for (int j = 0; j <i  ; j++) {
                    writer.write("*");
                }
                writer.write("\n");
                writer.flush();
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
