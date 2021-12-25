/*
 * Copyright (c) 2021.  created by @Ahmed Abd ElGhany
 */

package Lab.Sol;

/**
 * The type Sorting solen.
 */
public class SearchExample {

    /**
     * The Arr.
     */
    static int[] arr = {9, 5, 17, 3,22, 56, 43, 324, 234, 233, 11, 15};


    /**
     * Linear search int.
     *
     * @param query the query
     * @param arr   the arr
     * @return the index of the query if found else returns -1
     */
    public static int linearSearch(int query, int arr[]){
        // iterate over array to find element and check for array bounds
       for(int i = 0; i < arr.length; i++){
           if(arr[i] == query){
               return  i ;
           }
       }
       return -1;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        // record time at the start time of the program in nanoseconds!
        long startTime = System.nanoTime();

        // validate result conditionally
        int sol = linearSearch(233, arr);
        // if anything but the special case
        if(sol != -1) {
            if(sol < arr.length) {
                System.out.println("Found at index! " + sol);
            }
            // not supposed to be a case but just in case any odds happen
            else {
                System.out.println("Error code("+ sol + ")  array out of bounds");
            }
        }
        else {
            System.out.println("Not Found, code("+sol+")");
        }

        long endTime = System.nanoTime();

        double totalTime =  ((endTime - startTime) /  Math.pow(10,6));

        // linear search worst case scenario is O(n)
        System.out.println("Our Program take up to " +  totalTime + " ms");
    }
}
