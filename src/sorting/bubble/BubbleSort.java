package sorting.bubble;

import sorting.util;

import static sorting.util.printArray;

/**
 * The type Bubble sort.
 */
public class BubbleSort {
    private int[] arr;

    /**
     * Instantiates a new Bubble sort.
     *
     * @param arr the arr
     */
    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = util.arr_sorted;

        BubbleSort s = new BubbleSort(arr);
        printArray(arr);
        System.out.println();
        s.sort();
//        System.out.println();
        printArray(arr);

    }

    /**
     * Sort.
     */
    public void sort(){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            boolean isSorted = true;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1]  = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }

            if(isSorted){
                System.out.println("array is sorted! break now!");
                return;
            }
        }
    }





}
