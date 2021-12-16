package sorting.selection;

public class SelectionSort {
    private int[] arr;

    public SelectionSort(int[] arr){
        this.arr = arr;
    }

    // sort the array by selection Sort
    public void  sort() {
        for(int i = 0; i < arr.length ; i++){
            // select the smallest number each time
            int minNumIndex = i;
            // 10, 5, 3, 7, 2
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minNumIndex])
                {
                    minNumIndex = j;
                }
            }

            int temp = arr[minNumIndex];
            arr[minNumIndex] = arr[i];
            arr[i] = temp;
        }
    }


    public void printArray(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
