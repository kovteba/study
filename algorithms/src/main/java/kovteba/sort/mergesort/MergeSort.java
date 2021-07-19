package kovteba.sort.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {44, 69, 85, 79, 36, 98};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {

        if (arr.length < 2) {
            return arr;
        }

        int middle = arr.length / 2;

        int[] arr1 = Arrays.copyOfRange(arr, 0, middle);
        int[] arr2 = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(arr1), sort(arr2));
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int n = arr1.length + arr2.length;
        int[] arr = new int[n];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < n; i++) {
            if (index1 == arr1.length) {
                arr[i] = arr2[index2];
                index2++;
            } else if (index2 == arr2.length) {
                arr[i] = arr1[index1];
                index1++;
            } else {
                if (arr1[index1] < arr2[index2]) {
                    arr[i] = arr1[index1];
                    index1++;
                } else {
                    arr[i] = arr2[index2];
                    index2++;
                }
            }
        }
        return arr;
    }
}
