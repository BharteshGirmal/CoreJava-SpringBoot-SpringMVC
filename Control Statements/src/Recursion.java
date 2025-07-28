import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("Java Recursion Function");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number to find its factorial");
        int fact = input.nextInt();
        long factorial1 = findFactorial(fact);
        System.out.println("factorial of a Number "+fact+" is "+factorial1);
        long factorial2 = recursiveFact(fact);
        System.out.println("Recursive Factorial of "+fact+" is "+factorial2);
    }

    public static long findFactorial(int num){
        long fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long recursiveFact(int num){
        if(num == 1){
            return 1;
        }
        return num * recursiveFact(num-1);
    }
}
