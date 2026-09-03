import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();
        int ans = factorial(n);
        System.out.print(ans);
    }



    static int factorial(int n ){
        if(n == 1) {
            return 1;
        }

//        commit commit







        return n + factorial(n - 1);
    }
}


