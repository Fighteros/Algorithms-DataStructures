package sorting.selection;


import sorting.util;

import static sorting.util.printArray;

public class Run {

    public static void main(String[] args) {
        int[] arr = util.arr;;

        SelectionSort s = new SelectionSort(arr);

        printArray(arr);

        s.sort();

        System.out.println();

        printArray(arr);
    }
}
