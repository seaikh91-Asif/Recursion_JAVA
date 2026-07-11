package Patterns;

import java.util.Arrays;

public class triangle {
    public static void main(String[] args){
        int [] arr = {3, 4, 1, 2, 8, 9, 6, 8};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int [] arr, int row, int column) {
        if(row == 0){
            return;
        }

        if(column < row ){
            if(arr[column] > arr[column + 1]){
                // swap
                int temp = arr[column];
                arr[column] = arr[column + 1];
                arr[column + 1] = temp;
            }
            bubble(arr, row, column+1);
        } else {
            bubble( arr, row - 1, 0);
        }
    }
    static void triangle(int row , int column){
        if(row == 0){
            return;
        }

        if(column < row ){
            System.out.print(" *");
            triangle(row, column+1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }

    static void NormalTriangle(int row, int column){
        if(row == 0){
            return;
        }

        if(column < row ){
            NormalTriangle(row, column+1);
            System.out.print(" *");
        } else {
            NormalTriangle(row - 1, 0);
            System.out.println();
        }
    }
}
