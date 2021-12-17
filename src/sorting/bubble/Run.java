package sorting.bubble;

import sorting.util;

import static sorting.util.printArray;

public class Run {
    public static void main(String[] args) {
        int[] arr = util.arr_sorted;

        BubbleSort s = new BubbleSort(arr);
        printArray(arr);
        System.out.println();
        s.sort();
//        System.out.println();
        printArray(arr);

    }
}
