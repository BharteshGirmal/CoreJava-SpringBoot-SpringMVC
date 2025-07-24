import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========= Number Operations Menu =========\n");

        // 1. Multiplication table of given number
        System.out.println("************** Multiplication Table **************");
        System.out.print("Enter a number to generate its multiplication table: ");
        int num = input.nextInt();
        tableNumber(num);

        // 2. Sum of odd numbers from 0 to given number
        System.out.println("\n************** Sum of Odd Numbers **************");
        System.out.print("Enter a range to find the sum of odd numbers: ");
        int range = input.nextInt();
        int output = sumOfOddNumber(range);
        System.out.println("The sum of odd numbers from 1 to " + range + " is: " + output);

        // 3. Factorial of given number
        System.out.println("\n************** Factorial of Number **************");
        System.out.print("Enter a number to find its factorial: ");
        int fact = input.nextInt();
        int factorial = factorialOfNumber(fact);
        System.out.println("The factorial of " + fact + " is: " + factorial);

        // 4. Sum of Digits of Integer
        System.out.println("\n************** Sum of Digits **************");
        System.out.print("Enter a number to find the sum of its digits: ");
        int digitNum = input.nextInt();
        sumOfDigit(digitNum);

        // 5. Least Common Multiple (LCM)
        System.out.println("\n************** Least Common Multiple (LCM) **************");
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();
        int lcmOfTwo = leastCommonMultiple(firstNum, secondNum);
        System.out.println("LCM of " + firstNum + " and " + secondNum + " is: " + lcmOfTwo);

        // 6. Greatest Common Divisor (GCD)
        System.out.println("\n************** Greatest Common Divisor (GCD) **************");
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        int gcd = greatestCommonDiviso(number1, number2);
        System.out.println("GCD of " + number1 + " and " + number2 + " is: " + gcd);

        // 7. Prime Numbers in Range
        System.out.println("\n************** Prime Numbers in Range **************");
        System.out.print("Enter a range to find prime numbers up to: ");
        int prime = input.nextInt();
        System.out.print("Prime numbers from 2 to " + prime + ": ");
        checkPrimeNumbers(prime);

        // 8. Reverse the digits of a number
        System.out.println("\n************** Reverse a Number **************");
        System.out.print("Enter a number to reverse: ");
        int reverse = input.nextInt();
        int reverseResult = reverseNumber(reverse);
        System.out.println("The reversed number is: " + reverseResult);

        // 9. Fibonacci Series
        System.out.println("\n************** Fibonacci Series **************");
        System.out.print("Enter a range limit to print the Fibonacci series: ");
        int fibboRange = input.nextInt();
        System.out.print("Fibonacci series up to " + fibboRange + ": ");
        printFibonacciSeries(fibboRange);

        // 10. Armstrong Number & Palindrome Check
        System.out.println("\n************** Armstrong & Palindrome Check **************");
        System.out.print("Enter a number to check Armstrong & Palindrome: ");
        int armstrong = input.nextInt();
        checkArmStrong(armstrong);
        checkPalindrome(armstrong);

        System.out.println("\n========= Program Finished =========");
        input.close();
    }

    public static void tableNumber(int num) {
        System.out.println("\nMultiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static int sumOfOddNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static int factorialOfNumber(int range) {
        int factorial = 1;
        for (int i = 1; i <= range; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void sumOfDigit(int num) {
        int sum = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        System.out.println("The sum of digits of " + original + " is: " + sum);
    }

    public static int leastCommonMultiple(int firstNum, int secondNum) {
        int factor;
        for (int i = 1; i <= secondNum; i++) {
            factor = firstNum * i;
            if (factor % secondNum == 0) {
                return factor;
            }
        }
        return firstNum * secondNum;
    }

    public static int greatestCommonDiviso(int num1, int num2) {
        int gcd = 1;
        int min = Math.min(num1, num2);
        for (int i = 2; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void checkPrimeNumbers(int range) {
        for (int i = 2; i <= range; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int reverseNumber(int number) {
        int rev = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void printFibonacciSeries(int fibboRange) {
        int first = 0;
        int second = 1;

        if (fibboRange < 0) return;

        System.out.print(first + ", ");
        if (fibboRange == 0) {
            System.out.println("Number cannot be zero");
            return;
        }

        while (first + second <= fibboRange) {
            int third = first + second;
            System.out.print(third + ", ");
            first = second;
            second = third;
        }
        System.out.println();
    }

    public static void checkArmStrong(int number) {
        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }

    public static void checkPalindrome(int number) {
        int original = number;
        int reversed = 0;

        for (int temp = number; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }
    }
}
