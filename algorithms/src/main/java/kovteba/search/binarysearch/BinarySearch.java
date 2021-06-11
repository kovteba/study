package kovteba.search.binarysearch;

import java.util.Arrays;


public class BinarySearch {

    public static boolean binarySearch(int key, int[] arr) {

        if (arr.length == 2) {
            return key == arr[0] || key == arr[1];
        }

        int middle = (arr.length - 1) / 2;

        if (arr[middle] < key){
            var ints = Arrays.copyOfRange(arr, middle, arr.length);
            return binarySearch(key, ints);
        } else if (arr[middle] > key){
            var ints = Arrays.copyOfRange(arr, 0, middle);
            return binarySearch(key, ints);
        }

        return false;
    }

    public static void main(String[] args) {

        var arr = new int[]{1, 3, 12, 0, 100, 543, 65, 9, 23, 34, 9, 1, 4, 5, 6, 90};
        Arrays.sort(arr);
        System.out.println("RESYULT SEARCH " + binarySearch(23, arr));

    }
}
