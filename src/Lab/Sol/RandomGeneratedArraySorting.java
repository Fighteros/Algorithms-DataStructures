/*
 * Copyright (c) 2021.  created by @Ahmed Abd ElGhany
 */

package Lab.Sol;

import java.util.Scanner;

public class RandomGeneratedArraySorting {
    static int[] arr;

    public static void main(String[] args) {
        int[] sorted_arr = {1, 2, 3, 4, 5, 6, 7};
        int[] rand_arr = {7, 42, 38, 84, 74, 40, 72, 46, 54};

        int randNum;
        // get user input
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter any number: ");

        randNum = userInput.nextInt();

        // fill the array
        arr = generateNumbers(randNum);

        // print unsorted
        printArray(arr);
        // sort array
        long start = System.nanoTime();

//        selectionSort(arr);
//        bubbleSort(arr);

//        mergeSort(arr);

//        insertionSort(arr);

        quickSort(arr);
        // print sorted values
        printArray(arr);

        long end = System.nanoTime();
        System.out.println("Run time for quick sort is " + getRunTime(start, end) + "ms");
    }


    // print array
    public static void printArray(int[] arr) {
        if (arr != null) {
            System.out.print("[");
            for (int j : arr) {
                System.out.print(j + ", ");
            }
            System.out.println("]");
        }
    }

    // fills the array
    public static int[] generateNumbers(int bound) {
        int[] arr = new int[bound];
        for (int i = 0; i < bound; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    // calc method run time in seconds
    public static double getRunTime(long start, long end) {
        return (double) (end - start) / Math.pow(10, 6);
    }


    // sort the array increasing way
    public static void selectionSort(int[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minNumberIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[minNumberIndex] > arr[j]) {
                        minNumberIndex = j;
                    }
                }
                // swap the smallest number in the array with current i'th item
                int temp = arr[minNumberIndex];
                arr[minNumberIndex] = arr[i];
                arr[i] = temp;

            }
        }
    }


    // sort the array by bubble sort
    public static void bubbleSort(int[] arr) {
        boolean isSorted;
        for (int i = 0; i < arr.length - 1; i++) {
            isSorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // unsorted - swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    /* merge sort */
    public static void mergeSort(int arr[]) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int midPoint = (start + end) / 2;
            // merge left
            mergeSort(arr, start, midPoint);
            //merge right
            mergeSort(arr, midPoint + 1, end);
            // merge arrays
            merge(arr, start, midPoint, end);
        }
    }

    private static void merge(int[] arr, int start, int midPoint, int end) {
        int i, j, k;

        int sizeOfLeftArray = (midPoint - start) + 1;
        int sizeOfRightArray = end - midPoint;

        int leftArray[] = new int[sizeOfLeftArray];
        int rightArray[] = new int[sizeOfRightArray];

        for (i = 0; i < sizeOfLeftArray; i++) {
            leftArray[i] = arr[start + i];
        }

        for (j = 0; j < sizeOfRightArray; j++) {
            rightArray[j] = arr[midPoint + j + 1];
        }

        i = j = 0;
        k = start;

        while ((i < sizeOfLeftArray) && (j < sizeOfRightArray)) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }


        // if some side finished before the other
        while (i < sizeOfLeftArray) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < sizeOfRightArray) {
            arr[k] = rightArray[j];
            k++;
            j++;
        }
    }
    /* end  merge sort */

    public static void insertionSort(int arr[]){
        int j, key;

        for(int i = 1; i < arr.length; i++){
            key = arr[i];
            j = i - 1 ;

            // shift elements
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }


    /* quick sort */
    public static void quickSort(int arr[]) {
        quickSort(arr, 0, arr.length - 1 );
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pivot = partition(arr, start, end);

            quickSort(arr, start, pivot);

            quickSort(arr, pivot + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int i = start;
        int j = end;

        int pivot = arr[i];

        while(i < j) {

            while (arr[i] < pivot) {
                i++;
            }

            while(arr[j] > pivot) {
                j--;
            }

            if(i < j) {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return j;
    }


}