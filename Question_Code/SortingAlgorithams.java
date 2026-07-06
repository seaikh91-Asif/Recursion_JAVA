public class SortingAlgorithams {
    public static void main(String[] args){
        System.out.println("Sorting algo's");
        int [] arr = {2, 5, 3, 8, 6, 9, 10};

        System.out.print(bubbleSort(arr));
    }

    static void bubbleSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
