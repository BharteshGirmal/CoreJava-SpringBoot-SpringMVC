package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the File Name TO Read its Content");
        String filname = input.nextLine();

        try(FileReader reader = new FileReader(filname)){
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        }catch (FileNotFoundException exception){
            System.out.println("The Filename entered has some issues : "+ exception.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        }

}
