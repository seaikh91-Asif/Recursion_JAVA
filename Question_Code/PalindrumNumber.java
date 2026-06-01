import java.util.Scanner;

public class PalindrumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Print the result so the user can see it
        if (pail(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
        scanner.close();
    }

    // This is the method your main function calls
    static boolean pail(int n) {
        // We pass the original number and 0 as the initial reversed value
        return n == reverseHelper(n, 0);
    }

    // This helper method does the actual recursion without needing global variables
    static int reverseHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int rem = n % 10;
        return reverseHelper(n / 10, reversed * 10 + rem);
    }
}