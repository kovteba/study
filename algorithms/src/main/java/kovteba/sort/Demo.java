package kovteba.sort;

import kovteba.sort.bubblesort.BubbleSort;
import kovteba.sort.insertionsort.InsertionSort;

public class Demo {
    public static void main(String[] args) {

        System.out.println("\n===== Bubble Sort =====");
        long startTimeBubbleSort = System.currentTimeMillis();
        var bubbleSortResult = BubbleSort.bubbleSort(new int[]{1, 3, 12, 0, 100, 543, 65, 9, 23, 34, 9, 1, 4, 5, 6, 90});
        long endTimeBubbleSort = System.currentTimeMillis();
        for (int value : bubbleSortResult){
            System.out.print(value + " ");
        }
        System.out.println("\nBubble sort completed in " + (endTimeBubbleSort - startTimeBubbleSort));

        System.out.println("\n\n===== Insertion Sort =====");
        long startTimeInsertionSort = System.currentTimeMillis();
        var insertionSortResult = InsertionSort.insertionSort(new int[]{1, 3, 12, 0, 100, 543, 65, 9, 23, 34, 9, 1, 4, 5, 6, 90});
        long endTimeInsertionSort = System.currentTimeMillis();
        for (int value : insertionSortResult){
            System.out.print(value + " ");
        }
        System.out.println("\nInsertion sort completed in " + (endTimeInsertionSort - startTimeInsertionSort));


    }
}
