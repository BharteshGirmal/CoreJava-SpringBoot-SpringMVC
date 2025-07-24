public class Main {
    public static void main(String[] args) {
        System.out.println("🔁 Star Pattern Programs in Java 🔁\n");

        System.out.println("1️⃣ Left-Aligned Increasing Triangle:");
        leftAlignedTriangle();
        System.out.println();

        System.out.println("2️⃣ Left-Aligned Decreasing Triangle:");
        leftAlignedReverseTriangle();
        System.out.println();

        System.out.println("3️⃣ Centered Pyramid:");
        centeredPyramid();
        System.out.println();

        System.out.println("4️⃣ Centered Inverted Pyramid:");
        invertedCenteredPyramid();
        System.out.println();

        System.out.println("5️⃣ Right-Aligned Increasing Triangle:");
        rightAlignedTriangle();
        System.out.println();

        System.out.println("6️⃣ Right-Aligned Decreasing Triangle:");
        rightAlignedReverseTriangle();
    }

    // 1. Left-Aligned Increasing Triangle
    public static void leftAlignedTriangle() {
        int num = 5;
        for (int i = 1; i <= num; i++) { // start from 1 to avoid empty line
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2. Left-Aligned Decreasing Triangle
    public static void leftAlignedReverseTriangle() {
        int num = 8;
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3. Centered Pyramid
    public static void centeredPyramid() {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4. Inverted Centered Pyramid
    public static void invertedCenteredPyramid() {
        int num = 10;
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Right-Aligned Increasing Triangle
    public static void rightAlignedTriangle() {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. Right-Aligned Decreasing Triangle
    public static void rightAlignedReverseTriangle() {
        int num = 10;
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // fixed bug: use <= instead of <
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
