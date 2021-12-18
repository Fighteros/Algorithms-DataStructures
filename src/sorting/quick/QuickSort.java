package sorting.quick;

import sorting.util;

import static sorting.util.printArray;

/**
 * The type Quick sort.
 */
public class QuickSort {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = util.arr;

        printArray(arr);
        System.out.println();
        QuickSort.quickSort(arr, 0 , arr.length - 1 );
        printArray(arr);
    }

    /**
     * Quick sort.
     *
     * @param arr   the arr
     * @param start the start
     * @param end   the end
     */
    public static void quickSort(int[] arr, int start, int end){
        if (start < end){
            // get pivot
            int pivot = partition(arr, start, end);
            // sort left
            quickSort(arr, start, pivot);
            // sort right
            quickSort(arr, pivot + 1, end);
        }
    }

    /**
     * Partition int.
     *
     * @param arr   the arr
     * @param start the start
     * @param end   the end
     * @return the int
     */
    public static int partition(int[] arr, int start, int end) {

        // array indexes
        int i = start; //0
        int j = end; // 0
        int pivot = arr[i];

        // 90 70 100 20 30 50 120
        while(i < j) {
            while (arr[i] < pivot){
                i++;
            }

            while(arr[j] > pivot){
                j--;
            }

            if(i < j){
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        return j;
    }

}
