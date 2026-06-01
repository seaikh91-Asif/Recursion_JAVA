import java.util.Scanner;

public class CountZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Number of zeros: " + countZero(n));
        scanner.close();
    }

    static int countZero(int n) {

        if (n == 0) {
            return 1;
        }


        long positiveN = Math.abs((long) n);

        return helper(positiveN, 0);
    }


    static int helper(long n, int count) {

        if (n == 0) {
            return count;
        }


        long rem = n % 10;


        if (rem == 0) {
            return helper(n / 10, count + 1);
        }

        return helper(n / 10, count);
    }
}