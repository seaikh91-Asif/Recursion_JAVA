import java.util.Scanner;

public class Fobonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter till which term you want: ");
        int n = scanner.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int n){
        // base condition
        if(n < 2){
            return n;
        }

        return fibo(n - 1) + fibo (n - 2);
    }
}
