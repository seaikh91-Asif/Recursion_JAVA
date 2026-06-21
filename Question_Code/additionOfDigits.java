import java.util.Scanner;

public class additionOfDigits {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the digit: ");
        int n = scanner.nextInt();
        int ans = digits(n);
        System.out.print(ans);
    }

     // function for calculating

    static int digits(int n ){
        if(n == 0){
            return 0;
        }
        return (n % 10) + digits(n / 10);
    }

}
