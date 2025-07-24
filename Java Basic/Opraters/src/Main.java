import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*********** Operators In Java ***********");
        System.out.print("Enter the First Value : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Value : ");
        int num2 = input.nextInt();

        int addition = num1 + num2;
        int substraction = num1 - num2;
        int multiply = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;

        System.out.println("Addition : "+ addition);
        System.out.println("Multiplication : "+ multiply);
        System.out.println("Substraction : "+ substraction);
        System.out.println("Division : "+ division);
        System.out.println("Modulus : "+ modulus);
        System.out.println("*********** Product Of Two Floating Number ***********");
        System.out.print("Enter the First Decimal value : ");
        float value1 = input.nextFloat();
        System.out.print("Enter the second Decimal value : ");
        float value2 = input.nextFloat();

        float result =  value1 * value2;
        System.out.println("Result is : "+ result);
        System.out.println("*********** Perimeter of Rectangle ***********");
        System.out.print("Enter the length of rectangle : ");
        int length = input.nextInt();
        System.out.print("Enter the Width of rectangle : ");
        int width = input.nextInt();
        float Area = (float) (length + width)*2;
        System.out.println("Perimeter of Rectangle is : "+ Area);
        System.out.println("*********** Area of Triangle ***********");
        System.out.print("Enter the With of Triangle : ");
        int tWidth = input.nextInt();
        System.out.print("Enter the Height of Triangle : ");
        int tHeight = input.nextInt();
        int triangleArea = (tWidth + tHeight / 2);
        System.out.println("Area of Triangle : "+ triangleArea);
        System.out.println("*********** Calculate Simple Interest ***********");
        System.out.println("Enter the Principle amount : ");
        int amount = input.nextInt();
        System.out.println("Enter the Rate Of Interest (ROI) : ");
        float ROI = input.nextFloat();
        System.out.println("Enter the No on Tenure : ");
        int span = input.nextInt();
        float intrestRate = (float) (amount * ROI * span)/ 100;
        System.out.println("The Interest Amount is : "+ intrestRate);
        System.out.println("*********** Calculate Compound Interest ***********");
        double compoundInterest = amount * Math.pow((1 + ROI),span);
        System.out.println("The Compound Interest Amount is : "+ compoundInterest);

    }
}