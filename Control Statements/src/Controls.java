public class Controls {

    public static void main(String[] args) {
        // 1. Standard for loop
        System.out.println("Standard for loop (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // 2. For-each loop
        System.out.println("\nFor-each loop (Array iteration):");
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 3. for loop with break
        System.out.println("\nFor loop with break (Stop at 3):");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking at " + i);
                break;
            }
            System.out.println("i: " + i);
        }

        // 4. for loop with continue
        System.out.println("\nFor loop with continue (Skip 3):");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping " + i);
                continue;
            }
            System.out.println("i: " + i);
        }

        // 5. switch statement
        System.out.println("\nSwitch statement:");
        int day = 2;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }

        // 6. Ternary operator
        System.out.println("\nTernary operator:");
        int a = 10, b = 20;
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println("Result: " + result);
    }
}

