package Polymorphisum;

public class Overloading {

    public int summation(int a , int b){
        System.out.println("The Summation of Two Numbers is : ");
        return  a + b;
    }

    public int summation(int a , int b, int c){
        System.out.println("The Summation of Three Numbers is : ");
        return  a + b + c;
    }

    public String summation(String a , String b){
        System.out.println("The Summation of Two Strings is : ");
        return  a.concat(b);
    }

    public static void main(String[] args) {

        System.out.println("Method Overloading\n");

        Overloading obj = new Overloading();

        // Calling summation with two integers
        int sum2 = obj.summation(10, 20);
        System.out.println(sum2);

        // Calling summation with three integers
        int sum3 = obj.summation(5, 15, 25);
        System.out.println(sum3);

        // Calling summation with two strings
        String sumStr = obj.summation("Hello ", "World!");
        System.out.println(sumStr);
    }
}
