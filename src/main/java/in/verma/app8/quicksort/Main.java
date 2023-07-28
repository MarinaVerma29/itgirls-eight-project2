package in.verma.app8.quicksort;

public class Main {
    public static void main(String[] args) {
        String[] array= {
                "apple",
                "orange",
                "grape",
                "banana"
        };

        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void quickSort(String[] arr, int low, int high) {
        if (arr.length == 0 || low >= high) return;


        int middle = low + (high - low) / 2;
        String border = arr[middle];


        int i = low, j = high;
        while (i <= j) {
            while (arr[i].compareTo(border) < 0) {
                i++;
            }
            while (arr[j].compareTo(border) > 0) {
                j--;
            }
            if (i <= j) {
                String swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }

}
