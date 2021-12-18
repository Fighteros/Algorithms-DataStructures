package sorting.selection;

import sorting.util;

import static sorting.util.printArray;

/**
 * The type Selection sort.
 */
public class SelectionSort {
    private int[] arr;

    /**
     * Instantiates a new Selection sort.
     *
     * @param arr the arr
     */
    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    // sort the array by selection Sort

    /**
     * Sort.
     */
    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            // select the smallest number each time
            int minNumIndex = i;
            // 10, 5, 3, 7, 2
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minNumIndex]) {
                    minNumIndex = j;
                }
            }

            int temp = arr[minNumIndex];
            arr[minNumIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = util.arr;

        SelectionSort s = new SelectionSort(arr);

        printArray(arr);

        s.sort();

        System.out.println();

        printArray(arr);
    }
}
