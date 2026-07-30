package Sorting;

import java.util.Arrays;

public class Bubble_Recursion {
    public static void main(String[] args){
        int [] arr = {2, 3, 1, 5, 2, 6, 3, 7, 2};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int [] arr, int row, int column){
        if(row == 0) {
            return;
        }

        if(column < row){
            if(arr[column] > arr[column + 1]){
                // swap
                int temp = arr[column];
                arr[column] = arr[column + 1];
                arr[column + 1] = temp;
            }
            bubble(arr, row, column + 1);
        }

        else {
            bubble(arr, row + 1, 0);
        }
    }
}
