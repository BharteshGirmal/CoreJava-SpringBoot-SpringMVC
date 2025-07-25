import java.util.Scanner;

public class ArrayUtility {
    public static int[] getArrayInputs() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Size of the Array : ");
        int size = input.nextInt();

        int[] inputArr = new int[size];

        int i=0;
        while (i < inputArr.length){
            System.out.print("Enter the value of "+(i+1)+" Index : ");
            inputArr[i]= input.nextInt();
            i++;
        }

        return inputArr;
    }

    public static long sumOfArrayElements(int[] arr){
        int sum =0 ;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static double averageOfArrayElements(int[] arr){
        double sum = sumOfArrayElements(arr);
        return sum / arr.length;
    }

    public static int countNoOfOccurances(int [] arr, int num){
        int occurnce =0;
        int index=0;
        while (index < arr.length){
            if(arr[index] == num){
                occurnce++;
            }
            index++;
        }

        return occurnce;
    }

    public static int findMaximumValue(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is greater
            }
        }

        return max;
    }

    public static int findMinimumValue(int[] arr){
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static boolean checkArraySorted(int[] arr){

        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static boolean deleteElementFromArray(int[] arr , int num){

        int index =-1;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == num){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Element is not Present in Array");
            return false;
        }

        int [] newArr = new int[arr.length -1];
        for (int i = 0 , j=0; i <arr.length ; i++) {
            if(i == index)
            {
                continue;
            }
            newArr[j++] = arr[i];
        }

        System.out.println("New Array After Deletion");
        for(int val : newArr){
            System.out.print(val + " ");
        }
        System.out.println();
        return true;
    }

    public static int[] reverseArray(int[] arr){
        int[] resArr = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++) {
            resArr[i] = arr[arr.length - 1 - i];
        }

        return resArr;
    }

    public  static boolean checkArrayIsPalindrome(int[] arr1){

        System.out.println("Value from Array ");
        for(int val : arr1){
            System.out.print( val+"");
        }
        System.out.println();
        for (int i = 0; i < arr1.length ; i++) {
            if(arr1[i] != arr1[arr1.length -1 - i]){
                return false;
            }

        }
        return true;
    }
}
