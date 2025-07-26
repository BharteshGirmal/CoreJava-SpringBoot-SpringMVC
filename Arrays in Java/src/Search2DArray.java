import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        System.out.println("Search a Element in a 2D Array");
        int [][] numArr = get2DArrayInput();
        for(int[] val: numArr){
            for(int val2 : val){
                System.out.print(val2+" ");
            }
            System.out.println();
        }
        int sum = sumOf2DArray(numArr);
        System.out.println("The Sum Elements of the Array is : "+sum);
        int average = averageOfArrayElement(numArr);
        System.out.println("The Average of Elements from the Array is : "+average);
        Scanner input = new Scanner(System.in);
        int digonalSum = sumOfDigonalElements(numArr);
        System.out.println("The Sum of Digonal Elements of Array : "+digonalSum);
        System.out.println("Enter the Element to Search in above Array");
        int num = input.nextInt();
        boolean isFound =  search2DArr( numArr, num);
        if(isFound){
            System.out.println("Element "+num+" is found in the Array");
        }
        else {
            System.out.println("Element "+num+" is Not found in the Array");
        }
    }

    public static int[][] get2DArrayInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number of Rows : ");
        int rows = input.nextInt();
        System.out.println("Please Enter the Number of Columns : ");
        int columns = input.nextInt();

        int[][] num2DArray = new int[rows][columns];
        int i=0;
        while (i < rows){
            int j=0;
            while (j < columns){
                System.out.print("Enter the value of row : "+(i+1)+" and column : "+(j+
                        1)+" = ");
                num2DArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return  num2DArray;
    }

    public static boolean search2DArr(int[][] num2DArr, int num){
        int i =0;
        while (i < num2DArr.length){
            int j=0;
            while (j < num2DArr[i].length){
                if(num2DArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return  false;
    }

    public static int sumOf2DArray(int[][] numArr){
        int sum=0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length ; j++) {
                sum += numArr[i][j];
            }

        }

        return sum;
    }

    public  static int averageOfArrayElement(int [][] numArr){
        int sum = sumOf2DArray(numArr);
        int row = numArr.length;
        int col = numArr[row-1].length;
        int size = row * col ;
        return  sum / size;
    }

    public static int sumOfDigonalElements(int[][] matrix){
        int size = matrix.length;
        int sum =0;

        for (int i = 0; i < size ; i++) {
            sum += matrix[i][i];

            if( i != size - 1 - i){
                sum += matrix[i][size - 1 - i];
            }
        }
        return sum;

    }
}


