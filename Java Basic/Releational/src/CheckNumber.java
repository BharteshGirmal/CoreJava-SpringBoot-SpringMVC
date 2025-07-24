import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        if(num == 0){
            System.out.println("Entered Number is Zero");
        }else if(num > 0){
            System.out.println("Entered Number is a Positive Number");
            if(num %2 == 1){
                System.out.println("Entered Number is Odd Number");
            }
            else {
                System.out.println("Entered Number is Even Number");

            }
        }
        else {
            System.out.println("Entered Number is a Negative Number");

        }


    }
}
