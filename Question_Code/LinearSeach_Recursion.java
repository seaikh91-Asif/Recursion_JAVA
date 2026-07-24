import java.util.ArrayList;

public class LinearSeach_Recursion {
    public static void main(String[] args){
        int [] arr = {2, 3, 4, 1, 6, 7, 8, 4, 3, 3, 4, 5, 6};
        searchAll(arr, 4, 0);
        System.out.print(list);

    }
    static int search(int [] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return search(arr, target, index + 1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAll(int [] arr, int target, int index){
        if(index == arr.length - 1){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        searchAll(arr, target, index + 1);
    }
}
