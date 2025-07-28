import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String Data Types in Java");

        String str1 = "Bhartesh";
        String str2 = "Bhartesh";
        String str3 = new String("Bhartesh");
        String str4 = new String("Bhartesh");

        StringBuilder strBuild = new StringBuilder("Bhartesh");
        StringBuffer strBuffer = new StringBuffer("Bhartesh");

        // Reference comparison
        if (str1 == str2) {
            System.out.println("str1 == str2: Same reference (interned string)");
        } else {
            System.out.println("str1 == str2: Different reference");
        }

        if (str1 == str3) {
            System.out.println("str1 == str3: Same reference");
        } else {
            System.out.println("str1 == str3: Different reference (str3 created using new keyword)");
        }

        if (str3 == str4) {
            System.out.println("str3 == str4: Same reference");
        } else {
            System.out.println("str3 == str4: Different reference (both created using new)");
        }

        // Content comparison
        if (str1.equals(str2)) {
            System.out.println("str1.equals(str2): Same content");
        }

        if (str1.equals(str3)) {
            System.out.println("str1.equals(str3): Same content");
        }

        if (str1.equalsIgnoreCase("bhartesh")) {
            System.out.println("str1.equalsIgnoreCase(): Case-insensitive match");
        }

        // compareTo
        if (str1.compareTo(str2) == 0) {
            System.out.println("str1.compareTo(str2): Lexicographically equal");
        }

        // Comparing with StringBuilder / StringBuffer
        if (str1.equals(strBuild.toString())) {
            System.out.println("str1 equals StringBuilder content using toString()");
        }

        if (str1.equals(strBuffer.toString())) {
            System.out.println("str1 equals StringBuffer content using toString()");
        }

        // String intern behavior
        String str5 = str3.intern();
        if (str1 == str5) {
            System.out.println("str1 == str5 (interned): Now same reference due to interning");
        }

        // Immutability demonstration
        str1.concat(" Girmal");
        System.out.println("After concat, str1: " + str1); // Will still be "Bhartesh" because strings are immutable

        // Mutable version
        strBuild.append(" Girmal");
        System.out.println("After append, StringBuilder: " + strBuild);

        // Null-safe equals
        String nullStr = null;
        if ("Bhartesh".equals(nullStr)) {
            System.out.println("Safe equals check passed");
        } else {
            System.out.println("Safe equals check prevented NullPointerException");
        }

        Student newStudent = new Student("Bhartesh", 27);
        System.out.println(newStudent.toString());

        String upName = newStudent.name;
        char[] charArr = upName.toCharArray();

        char[] UppercaseStr = new char[charArr.length];
        for (int i = 0; i <charArr.length ; i++) {
            UppercaseStr[i] = Character.toUpperCase(charArr[i]);
        }
        System.out.println(UppercaseStr);
    }
}
