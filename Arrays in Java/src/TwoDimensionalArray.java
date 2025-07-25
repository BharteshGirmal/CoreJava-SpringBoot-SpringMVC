public class TwoDimensionalArray {

    public static void main(String[] args) {
        // Create a Program to Merge 2 Sorted Array

        System.out.println("Merge Two Arrays in Sorted Form");
        System.out.println("Please Fill the Details");
        int[] arr1= ArrayUtility.getArrayInputs();
        int[] arr2= ArrayUtility.getArrayInputs();
        int [] mergredArray = mergeTwoArrays(arr1,arr2);

        for(int value : mergredArray){
            System.out.print(value+ ", ");
        }
        System.out.println();

    }

    private static int[] mergeTwoArrays(int[] arr1, int[] arr2) {

        int[] mergeArr = new int[arr1.length + arr2.length];

        int i=0, j=0, k=0;

        while (i < arr1.length){
            mergeArr[i]= arr1[i];
            i++;
        }
        while (j < arr2.length){
            mergeArr[arr1.length + j]= arr2[j];
            j++;
        }

        // Sort the merged array using bubble sort
        for (int x = 0; x < mergeArr.length - 1; x++) {
            for (int y = 0; y < mergeArr.length - 1 - x; y++) {
                if (mergeArr[y] > mergeArr[y + 1]) {
                    // Swap mergeArr[y] and mergeArr[y + 1]
                    int temp = mergeArr[y];
                    mergeArr[y] = mergeArr[y + 1];
                    mergeArr[y + 1] = temp;
                }
            }
        }
        return mergeArr;
    }
}
