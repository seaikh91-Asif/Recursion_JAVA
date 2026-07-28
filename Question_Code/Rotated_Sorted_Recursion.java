public class Rotated_Sorted_Recursion {
    public static void main(String [] args){
        int [] arr = { 5, 6, 7, 8, 9, 4, 3, 2, 1};
        System.out.println(RBC(arr, 3, 0, arr.length - 1));
    }

    static int RBC( int [] arr, int target, int start, int end){
       if(start > end){
           return -1;
       }

       int mid = start + (end - start);

       if(arr[mid] == target){
           return mid;
       }

       if (arr[start] <= arr[mid]){
           if(target >= arr[start] && target <= arr[mid]){
              return RBC(arr,target, start, mid - 1);
           } else {
               return RBC(arr, target, mid + 1, end);
           }
       }

       if(target >= arr[mid] && target <= arr[end]){
           return RBC(arr, target, mid + 1, end );
       } else {
           return RBC(arr, target, start, mid - 1);
       }
    }
}
