package sliding_window;

public class SlidingWindow {
    public static void main(String[] args){
        int [] arr = { 2, 1, 5, 7, 4, 9, 6, 2, 3, 1};
        int k = 3; // expected answer is 20
        System.out.println(slidingWindow(arr, k));
    }

    static int slidingWindow(int arr[], int k){
        int max = Integer.MIN_VALUE;;
        int i = 0;
        int j = 0;
        int sum = 0;

        while ( j < arr.length) {
            sum += arr[j];

            if(j - i + 1 < k) {
                j++;
            } else if( j - i + 1 == k) {
                max = Math.max(max, sum);

                sum = sum - arr[i];

                i++;
                j++;
            }
        }
        return max;
    }
}
