package kovteba.sort;

import kovteba.sort.bubblesort.BubbleSort;
import kovteba.sort.heapsort.HeapSort;
import kovteba.sort.insertionsort.InsertionSort;
import kovteba.sort.mergesort.MergeSort;

import java.util.*;

public class Demo {

    static int countElements;
    static int countOfRepetitions;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("The number of elements in the array: ");
        countElements = in.nextInt();
        System.out.print("Number of repetitions: ");
        countOfRepetitions = in.nextInt();


        Map<Integer, Long> bubbleSortTimes = new HashMap<>();
        for (int i = 0; i < countOfRepetitions; i++) {
            int[] unsortedBubbleSortArray = generateArray();
            long startTimeBubbleSort = System.currentTimeMillis();
            BubbleSort.bubbleSort(unsortedBubbleSortArray);
            long endTimeBubbleSort = System.currentTimeMillis();
            bubbleSortTimes.put(i, endTimeBubbleSort - startTimeBubbleSort);
        }
        System.out.println("Bubble: " + bubbleSortTimes);

        Map<Integer, Long> insertionSortTimes = new HashMap<>();
        for (int i = 0; i < countOfRepetitions; i++) {
            int[] unsortedInsertionSortArray = generateArray();
            long startTimeInsertionSort = System.currentTimeMillis();
            InsertionSort.insertionSort(unsortedInsertionSortArray);
            long endTimeInsertionSort = System.currentTimeMillis();
            insertionSortTimes.put(i, endTimeInsertionSort - startTimeInsertionSort);
        }
        System.out.println("Insertion: " + insertionSortTimes);

        Map<Integer, Long> heapSortTimes = new HashMap<>();
        for (int i = 0; i < countOfRepetitions; i++) {
            int[] unsortedHeapSortArray = generateArray();
            long startTimeHeapSort = System.currentTimeMillis();
            HeapSort.sort(unsortedHeapSortArray);
            long endTimeHeapSort = System.currentTimeMillis();
            heapSortTimes.put(i, endTimeHeapSort - startTimeHeapSort);
        }
        System.out.println("Heap: " + heapSortTimes);

        Map<Integer, Long> mergeSortTimes = new HashMap<>();
        for (int i = 0; i < countOfRepetitions; i++) {
            int[] unsortedMergeSortArray = generateArray();
            long startTimeMergeSort = System.currentTimeMillis();
            MergeSort.sort(unsortedMergeSortArray);
            long endTimeMergeSort = System.currentTimeMillis();
            mergeSortTimes.put(i, endTimeMergeSort - startTimeMergeSort);
        }
        System.out.println("Merge: " + mergeSortTimes);

        Map<Integer, Long> selectionSortTimes = new HashMap<>();
        for (int i = 0; i < countOfRepetitions; i++) {
            int[] unsortedSelectionSortArray = generateArray();
            long startTimeSelectionSort = System.currentTimeMillis();
            MergeSort.sort(unsortedSelectionSortArray);
            long endTimeSelectionSort = System.currentTimeMillis();
            selectionSortTimes.put(i, endTimeSelectionSort - startTimeSelectionSort);
        }
        System.out.println("Selection: " + selectionSortTimes);

        //bubble
        Long bubble = 0L;
        Long insertion = 0L;
        Long heap = 0L;
        Long merge = 0L;
        Long selection = 0L;

        for (int i = 0; i < countOfRepetitions; i++) {
            bubble += bubbleSortTimes.get(i);
            insertion += insertionSortTimes.get(i);
            heap += heapSortTimes.get(i);
            merge += mergeSortTimes.get(i);
            selection += selectionSortTimes.get(i);
        }

        System.out.println(" <= Average values =>");
        System.out.println("Bubble sort: " + bubble / (double)countOfRepetitions);
        System.out.println("Insertion sort: " + insertion / (double)countOfRepetitions);
        System.out.println("Heap sort: " + heap / (double)countOfRepetitions);
        System.out.println("Merge sort: " + merge / (double)countOfRepetitions);
        System.out.println("Selection sort: " + selection / (double)countOfRepetitions);

    }

    static int[] generateArray() {

        Random random = new Random();

        int[] array = new int[countElements];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }
}
