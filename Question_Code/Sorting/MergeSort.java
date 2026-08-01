package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int [] arr = {3, 4, 2, 6, 7, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int [] mergeSort(int [] arr ){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int [] first = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] seoond = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(arr, first, seoond);
    }

    static int [] merge(int [] arr,  int [] first, int [] second){

        int [] mix = new int [first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length &&  j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix [k] =  second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
