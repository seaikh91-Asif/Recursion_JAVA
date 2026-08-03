package Sorting;

import java.util.Arrays;

public class MergeSort_InPlace {
    public static void main(String[] args){
        int [] arr = {3, 6, 7, 9, 1, 2};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInplace(int [] arr, int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

         mergeInplace(arr, s, mid, e);
    }

    static void mergeInplace(int [] arr, int s, int mid, int e){
        int [] mix = new int [e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e){
            if (arr[i] < arr[j]){
                mix[k] = mix[i];
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(i < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < mix.length; l++){
            arr[s + i] = mix[i];
        }
    }
}
