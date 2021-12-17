package sorting.merge;

public class MergeSort {

    public MergeSort(int[] arr) {
    }

    /**
     * Sort.
     *
     * @param arr   the arr
     * @param start the start
     * @param end   the end
     */
    public static void sort(int arr[], int start, int end) {
        if(start < end)
        {
            // get midpoint
            int midpoint = start + (end - start) / 2;
            // sort left
            sort(arr, start, midpoint);
            // sort right
            sort(arr, midpoint + 1, end);
            // merge
            merge(arr, start, midpoint, end);
        }
    }


    /**
     * Merge.
     *
     * @param arr      the arr
     * @param start    the start
     * @param midpoint the midpoint
     * @param end      the end
     */
    public static void merge(int arr[], int start, int midpoint, int end){
        // indexes
        int i, j, k ;

        // get sizeOfFirstArray
        int sizeOfFirstArray = (midpoint - start) + 1;
        // get sizeOfSecArray
        int sizeOfSecArray = (end - midpoint);

        // sub-arrays
        int[] firstArray = new int[sizeOfFirstArray];
        int[] secondArray = new int[sizeOfSecArray];

        // fill arrays

        for(i = 0; i < sizeOfFirstArray; i++){
            firstArray[i] = arr[start + i];
        }

        for(j = 0; j < sizeOfSecArray; j++){
            secondArray[j] = arr[midpoint + j + 1];
        }

        i = j = 0;
        k = start;
        // merge & sort

        while(i < sizeOfFirstArray && j < sizeOfSecArray)
        {
            if(firstArray[i] <= secondArray[j])
            {
                arr[k] = firstArray[i];
                i++;
            }else {
                arr[k] = secondArray[j];
                j++;
            }
            k++;
        }

        // side conditions
        while(i < sizeOfFirstArray)
        {
            arr[k] = firstArray[i];
            i++;
            k++;
        }

        while(j < sizeOfSecArray) {
            arr[k] = secondArray[j];
            j++;
            k++;
        }
    }
}
