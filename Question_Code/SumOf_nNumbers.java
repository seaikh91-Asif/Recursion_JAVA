import java.util.Scanner;

public class SumOf_nNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scanner.nextInt();
        int ans = sum(n);
        System.out.println(ans);

    }

    static int sum(int n ){

        if(n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
