//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Array Programs");

        int[] arr = new int[15];

        int[] newArr = {1,2,3,4,5,6,7,8,9,20};
        System.out.println(Arrays.toString(newArr));

        int[][] twoDimensionArr = new int[5][8];

        int [][] newDiamensionArr = {{1,2,3,4},{8,5,7,5},{9,8,9,98}};
        System.out.println(Arrays.deepToString(newDiamensionArr));


        int i=0;
        while (i < newDiamensionArr.length ){
            int j=0;
            while (j < newDiamensionArr[i].length ){
                System.out.print(newDiamensionArr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}