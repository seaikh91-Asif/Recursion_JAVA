import java.util.Scanner;

public class LInearSearhc_UsingRecursion {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 3, 2, 3, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter item that you want to seach: ");
        int target = scanner.nextInt();
        System.out.println(LinearSearch(arr, 0, target));
    }

    static int LinearSearch(int [] arr, int index,  int target){
        if(arr[index] == arr.length){
            return index;
        }

        if(arr[index] == target){
            return index;
        }
        else {
            return LinearSearch(arr, index + 1, target);
        }
    }
}
