package sorting.bubble;

public class BubbleSort {
    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    /**
     * Sort.
     */
    public void sort(){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            boolean isSorted = true;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1])
                {
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
