public class SortedOrNot_UisingRecursion {
    public static void main(String[] args){
        int [] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(IsSorted(arr, 0));

    }

    static boolean IsSorted(int [] arr, int index){
        if(arr[index] == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && IsSorted(arr, arr[index + 1]);
    }
}
