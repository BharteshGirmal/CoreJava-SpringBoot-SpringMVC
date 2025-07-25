import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("************** Array Coding Challenges **************");


        int[] arr = ArrayUtility.getArrayInputs();
        System.out.println("Entered Values of Array are : ");
        System.out.println(Arrays.toString(arr));
        double sum= ArrayUtility.sumOfArrayElements(arr);

        System.out.println("Sum of Elements of Array is : "+ sum);
        double average = ArrayUtility.averageOfArrayElements(arr);
        System.out.println("Average of Elements of Array is : "+ average);
        int min= ArrayUtility.findMinimumValue(arr);
        System.out.println("Minimum Value From Array is : "+min);
        int max = ArrayUtility.findMaximumValue(arr);
        System.out.println("Maximum Value From Array is : "+max);
        boolean sorted = ArrayUtility.checkArraySorted(arr);
        if(sorted){
            System.out.println("The Given array is in sorted form");
        }
        else {
            System.out.println("The Given array is Not sorted");

        }
        boolean isPalindrome = ArrayUtility.checkArrayIsPalindrome(arr);
        if(isPalindrome){
            System.out.println("Array is Palindrome");
        }
        else {
            System.out.println("Array is Not Palindrome");
        }
        System.out.println("Enter the Element to Delete from an Array: ");
        int numToDelete = input.nextInt();
        boolean isDeleted = ArrayUtility.deleteElementFromArray(arr, numToDelete);
        if(isDeleted){
            System.out.println("Element Deleted");
        }
        else {
            System.out.println("Unable to Delete");

        }

        int[] Reverse = ArrayUtility.reverseArray(arr);
        System.out.println("The Reversed Array is : ");
        for(int val: Reverse){
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("Enter a number to find its Occurances : ");
        int num = input.nextInt();
        int occ= ArrayUtility.countNoOfOccurances(arr, num);
        System.out.println("No of Occurence of "+num+" is : "+occ);

    }


}
