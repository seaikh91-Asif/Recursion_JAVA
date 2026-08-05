package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args){
        int [] arr = {2, 1, 4, 1, 6, 1};
        selection(arr, arr.length, 0, 0); // Fixed from arr.length - 1 to arr.length
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int [] arr, int r, int c, int max){
        if(r == 0){
            return;
        }

        if(c < r){
            if(arr[c] > arr[max]){
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }

    }

}