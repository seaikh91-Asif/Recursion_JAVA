class SumOfN_naturalNumber_GFG {

    public static void main(String args[]){
        int n = 2;
        System.out.println(recurSum(n));
    }

    public static int recurSum(int n){

        if(n == 0){
            return 0;
        }
       return n + recurSum(n - 1);

    }
}