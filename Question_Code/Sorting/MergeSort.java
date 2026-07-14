package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] data = {5, 4, 3, 2, 1};
        int[] sortedData = mergeSort(data);
        System.out.println(Arrays.toString(sortedData));
    }

    public static int[] mergeSort(int[] arr) {
        // Base case: arrays with 0 or 1 elements are already sorted
        if (arr.length == 1) {
            return arr;


        }

        int mid = arr.length / 2;

        // Recursively split and sort both halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the sorted halves back together
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0; // Pointer for 'first' array
        int j = 0; // Pointer for 'second' array
        int k = 0; // Pointer for 'mix' array

        // Compare elements from both arrays and merge them in sorted order
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the 'first' array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the 'second' array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    static void mergeSortInPlace(int [] arr, int start, int end){
        if(end - start == 1){
            return;
        }

        int mid = (start + end) / 2;

        mergeSortInPlace(arr , start, mid);
        mergeSortInPlace(arr, mid, end );

        return mergeInPlace(arr, start, mid, end);
    }

    static int [] mergeInPlace(int [] arr, int start, int mid, int end){
        int [] mix = new int [end - start];


    }
}
