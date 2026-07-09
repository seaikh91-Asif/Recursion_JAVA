public class LinearSearch_Recursion {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        System.out.println(isExists(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
    }

        //boolean value is the exists or not
    static boolean isExists(int [] arr, int target, int index){
       if(index == arr.length){
           return false;
       }

       return arr[index] == target || isExists(arr, target, index +1);
    }

        // finding the index of the targeted element
    static int findIndex(int [] arr, int target, int index){
        if(index == arr.length){
            return index;
        }
        if(arr[index]  == target){
            return index;
        } else {
            return findIndex(arr, target, index +1);
        }
    }
}
