package kovteba.insertionsort;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int value;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
        return arr;
    }
}
