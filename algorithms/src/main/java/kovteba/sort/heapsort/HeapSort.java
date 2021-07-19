package kovteba.sort.heapsort;

import java.util.Arrays;

public class HeapSort {

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            buildHeap(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            buildHeap(arr, i, 0);
        }
    }

    static void buildHeap(int[] arr, int n, int i) {

        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {

            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            buildHeap(arr, n, largest);
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 12, 9, 5, 6, 10, 11, 12, 13};

        System.out.println("INIT: " + Arrays.toString(arr));
        sort(arr);

        System.out.println("Sorted array is " + Arrays.toString(arr));
    }

    static void printHeap(int[] arr) {
        printHeap(arr, arr.length / 2 - 1, 0, 1);
    }

    static String printHeap(int[] arr, int level, int index, int count) {

        if (index == arr.length - 1) {
            return "";
        }

        String constantSpace = "    ";
        String levelSpace = "";
        String space = "            ";
        for (int i = 0; i < level; i++) {
            levelSpace = levelSpace + constantSpace;
        }

        StringBuilder builder = new StringBuilder();
        builder.append(levelSpace);

        for (int i = 0; i < count; i++) {

            builder.append(arr[index]);
            if (i % 2 != 0) {
                builder.append(" ");
            } else {
                builder.append("        ");
            }


            if (index != arr.length - 1) {
                index = index + 1;
            } else {
                System.out.println(builder);
                return "";
            }

        }
        System.out.println(builder);
        builder.setLength(0);
        int nextCount = count * 2;
        int nextLevel = level - 1;
        printHeap(arr, nextLevel, index, nextCount);
        return "";
    }

}
