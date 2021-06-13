package kovteba.search.exponentialsearch;

import java.util.Arrays;

public class ExponentialSearch {

    public static int exponentialSearch(int[] arr, int key) {

        if (arr[0] == key) {// 1
            return 0;
        }

        if (arr[arr.length - 1] == key) {
            return arr.length;
        }

        int range = 1;

        while (range < arr.length && arr[range] <= key) {
            range = range * 2;
        }

        return Arrays.binarySearch(arr, range / 2, Math.min(range, arr.length), key);
    }

    public static void main(String[] args) {

        var arr = new int[]{1, 3, 12, 0, 100, 543, 65, 9, 23, 34, 9, 1, 4, 5, 6, 90, 200, 12, 23, 44};
        Arrays.sort(arr);
        System.out.println("Result search: " + exponentialSearch(arr, 543));
    }
}
