public class Cheack_Array_SortedOrNot {
    public static void main(String[] args){
        int [] arr = { 9, 2,  4, 5, 6, 7, 8, 9};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int [] arr, int index){
        if(arr[index] == arr.length){
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
