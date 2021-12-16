package sorting.selection;

public class Run {

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 7, 2};

        SelectionSort s = new SelectionSort(arr);

        s.printArray();

        s.sort();

        s.sort();

        System.out.println();

        s.printArray();
    }
}

