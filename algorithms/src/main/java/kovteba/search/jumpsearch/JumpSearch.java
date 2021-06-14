package kovteba.search.jumpsearch;

import java.util.Arrays;

public class JumpSearch {

    public static int jumpSearch(int key, int[] arr) {

        int jumpSize = (int)Math.floor(Math.sqrt(arr.length));
        int step = jumpSize;

        while (arr[Math.min(step, arr.length) - 1] < key && step < arr.length) {
            step = step + jumpSize;
        }

        for (int i = (step - jumpSize); i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }



    public static void main(String[] args) {

        var arr = new int[]{1, 2, 3, 4, 12, 0, 100, 543, 65, 9, 23, 34, 9, 1, 4, 5, 6, 90};
        Arrays.sort(arr);
        int index = jumpSearch(2, arr);
        System.out.println("INDEX : " + index);

    }
}
