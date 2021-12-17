package sorting.merge;

import sorting.util;
import static sorting.util.printArray;

public class Run {
    public static void main(String[] args)
    {
        int arr_new[] = util.arr;

        MergeSort s = new MergeSort(arr_new);
        printArray(arr_new);
        System.out.println();
        s.sort(arr_new, 0, arr_new.length - 1);
        printArray(arr_new);
    }
}
