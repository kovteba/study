package kovteba.search.interpolationsearch;

import java.util.Arrays;

public class InterpolationSearch {

    public static int interpolationSearch(int key, int[] arr){

        int startIndex = 0;
        int lastIndex = (arr.length - 1);

        while (startIndex < lastIndex){
            int pos = startIndex + (((lastIndex-startIndex) / (arr[lastIndex]-arr[startIndex]))*(key - arr[startIndex])); // функция линейной интерполяции
            if (arr[pos] == key) {
                return pos;
            }
            if (arr[pos] < key){
                startIndex = pos + 1;
            }
            else {
                lastIndex = pos - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        var arr = new int[]{1, 2, 3, 4, 12, 0, 100, 543, 65, 9, 23, 34, 9, 1, 4, 5, 6, 90};
        Arrays.sort(arr);
        int index = interpolationSearch(2, arr);
        System.out.println("INDEX : " + index);
    }
}
