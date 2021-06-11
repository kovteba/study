package kovteba.sort.bubblesort;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) { // if current value biggest then next
                    sorted = false; // set the flag that the array is not sorted
                    int tmp = arr[i]; // save current value to tmp variable
                    arr[i] = arr[i + 1]; // replace next value to current value
                    arr[i + 1] = tmp; // save into next value value from tmp variable
                }
            }
        }
        return arr;
    }

}
