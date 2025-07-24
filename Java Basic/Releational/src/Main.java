import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("---------------- Relational Operators ----------------");
        System.out.print("\nEnter the your Age : ");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You are eligible for license");
        }
        else {
            System.out.println("Sorry... you are still minor ");
        }
    }
}