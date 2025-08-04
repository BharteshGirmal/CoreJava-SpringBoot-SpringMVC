import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exception Handling");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the two numbers: ");
        int num = input.nextInt();
        System.out.println("Enter Second Value : ");
        int num2 = input.nextInt();

        try {
            int res = num / num2;
            System.out.println("Result : " + res);
        } catch (ArithmeticException e) {
//            e.printStackTrace(); // Correct usage
            // OR, if you want to print a simple message:
             System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }catch (Throwable th){
            System.out.println(th.getMessage());
        }
    }
}
