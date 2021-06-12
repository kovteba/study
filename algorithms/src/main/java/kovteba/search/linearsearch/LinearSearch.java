package kovteba.search.linearsearch;

import java.util.Arrays;

public class LinearSearch {

    public static boolean linearSearch(int key, int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (key == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        var arr = new int[]{1, 3, 12, 0, 100, 543, 65, 9, 23, 34, 9, 1, 4, 5, 6, 90};
        Arrays.sort(arr);
        System.out.println("Result search: " + linearSearch(100, arr));
    }
}
