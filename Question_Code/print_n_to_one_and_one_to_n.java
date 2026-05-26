import java.util.Scanner;

public class print_n_to_one_and_one_to_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();
//        NtoOne(n);
//        OnetoN(n);
        both(n);
    }
    static void NtoOne(int n){
        if( n == 0){
            return;
        }
        System.out.println(n);
        NtoOne(n - 1);
    }

    static void OnetoN(int n){
        if( n == 0){
            return;
        }
        OnetoN(n - 1);
        System.out.println(n);
    }

    static void both(int n){
        if( n == 0){
            return;
        }
        System.out.println(n);
        both(n - 1);
        System.out.println(n);
    }
}