public class LinearSearch_Recursion {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        System.out.println(isExists(arr, target, 0));
    }

    static boolean isExists(int [] arr, int target, int index){
       if(index == arr.length){
           return false;
       }

       return arr[index] == target || isExists(arr, target, index +1);
    }

    static int findIndex(int [] arr, int target, int index){
        if(index == arr.length){
            return index;
        }
        if(arr[index]  == target){
            return index;
        } else {
            return isExists(arr, target, index +1);
        }
    }
}
