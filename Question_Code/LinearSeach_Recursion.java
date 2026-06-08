import java.util.Scanner;

public class LinearSeach_Recursion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number that you want to seach: ");
        int target = scanner.nextInt();

        int [] arr = {1, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(search(arr, target, 0));
    }
    static int search(int [] arr, int target, int index){

        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return search(arr, target, index+1);
    }
}
