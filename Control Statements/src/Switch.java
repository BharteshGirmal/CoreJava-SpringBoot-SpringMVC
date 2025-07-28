import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlease select from the following");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Find the day");
            System.out.println("0. Exit from menu");

            choice = input.nextInt();

            switch (choice) {
                case 1 -> performAddition(input);
                case 2 -> performSubtraction(input);
                case 3 -> findDay(input);
                case 0 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid option, please try again.");
            }

        } while (choice != 0);
    }

    // Method for addition
    static void performAddition(Scanner input) {
        System.out.print("Enter two numbers to add: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Result: " + (a + b));
    }

    // Method for subtraction
    static void performSubtraction(Scanner input) {
        System.out.print("Enter two numbers to subtract: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Result: " + (a - b));
    }

    // Method to find the day name
    static void findDay(Scanner input) {
        int day;
        do {
            System.out.println("\nEnter the day number (1–7), or 8 to return to main menu:");
            day = input.nextInt();

            String dayName = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                case 8 -> "Returning to main menu...";
                default -> "Invalid day. Please enter a number between 1 and 8.";
            };

            System.out.println(dayName);
        } while (day != 8);
    }
}
