import java.util.Scanner;

public class Logical {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ************** Ticket Discount Calculator **************");
        System.out.print("Please Enter Your Age : ");
        int age = input.nextInt();

        System.out.print("Are you Male or Female (true/false)");
        boolean isFemale = input.nextBoolean();

        if(age > 6){
            System.out.println("Congratulations You got 💰 75% Discount");

        }
        else  if(isFemale){
            System.out.println("Congratulations You got 💰 50% Discount");

        }else if(age > 60 && !isFemale){
            System.out.println("Congratulations You got 💰 75% Discount");
        }
        else {
            System.out.println("🥲 Sorry You got No Discount");
        }
    }
}
