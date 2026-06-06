class SumOfN_naturalNumber_GFG {

    public static void main(String args[]){
        int n = 3;
        System.out.println(recurSum(n));
    }

    public static int recurSum(int n){

        // base case
        if (n == 0)
            return 0;

        // recursive case
        return n + recurSum(n - 1);
    }
}