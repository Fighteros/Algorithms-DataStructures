package sorting.insertion;

public class InsertionSort {


    /**
     * Sort.
     *
     * @param arr the arr
     */
    public static void sort(int arr[]) {
        int key , j ;

        for(int i = 1; i < arr.length; i++){
            key = arr[i];
            j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }
}
