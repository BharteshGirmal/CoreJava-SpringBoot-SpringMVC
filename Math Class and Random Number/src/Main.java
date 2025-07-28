import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Welcome to Math Class in Java");
        for (int i = 1; i <=10 ; i++) {
            long random = Math.round(Math.random() *10);
            System.out.println(random);
        }
        System.out.println();
        System.out.println("Enter a Number to find its Mathematical Operations");
        int num = input.nextInt();
        System.out.println(Math.abs(num));
        System.out.println(Math.ceil(100.233));
        System.out.println(Math.floor(100.233));
        System.out.println(Math.sqrt(num));
        System.out.println(Math.exp(num));


    }
}