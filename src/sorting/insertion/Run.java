package sorting.insertion;

import sorting.util;

import static sorting.util.printArray;

public class Run {

    public static void main(String[] args) {

        int arr[] = util.arr;

        printArray(arr);

        System.out.println();

        InsertionSort.sort(arr);

        printArray(arr);
    }

}
