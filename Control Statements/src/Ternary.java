import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        System.out.println("Ternary Operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the value 1 : ");
        int num1 = input.nextInt();
        System.out.print("Please Enter the value 2 : ");
        int num2 = input.nextInt();

        boolean res = num1 > num2 ? true: false;
        if(res){
            System.out.println("value 1 is greater than value2");
        }
        else {
            System.out.println("value 2 is greater than value1");
        }
    }
}
