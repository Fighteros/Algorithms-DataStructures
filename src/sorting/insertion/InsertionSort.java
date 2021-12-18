package sorting.insertion;

import sorting.util;

import static sorting.util.printArray;

/**
 * The type Insertion sort.
 */
public class InsertionSort {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        int arr[] = util.arr;

        printArray(arr);

        System.out.println();

        InsertionSort.sort(arr);

        printArray(arr);
    }

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
