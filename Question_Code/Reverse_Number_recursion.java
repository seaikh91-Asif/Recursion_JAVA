import java.lang.Math;

public class Reverse_Number_recursion {
    public static void main(String[] args){
        int ans = rev2(-12);
        System.out.println(ans);

    }

//    static int sum = 0;
//    static void rev1(int n){
//        if(n == 0){
//            return ;
//        }
//        int rem = n % 10;
//        sum = sum * 10 + rem;
//        rev1(n / 10);
//    }

    static int rev2(int n ){
        boolean isNagative = n < 0;
        int positiveN = Math.abs(n);

        int digits = (int)(Math.log10(positiveN)) + 1;

        int reversed = helper(positiveN, digits);
        return isNagative ? -reversed : reversed;
    }

    static int helper (int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
