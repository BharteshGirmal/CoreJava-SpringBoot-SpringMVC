package Exception;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Two Numbers Below ");
        System.out.print("Number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Number 2 : ");
        int num2 = input.nextInt();

        try {
            int res = num1/num2;
            System.out.println("Result : "+ res);
        }catch (ArithmeticException err){
            System.out.println("Something Went wrong while Calculation : "+ err.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
