import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the digit: ");
        int n = scanner.nextInt();
        int ans = prod(n);
        System.out.print(ans);

    }
    static int prod(int n){
        if(n%10 == n){
            return n;
        }
        return (n % 10) * prod(n / 10);
    }
}
