package com.dusinski.sortcompare.sort;

public class QuickSort implements SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {

        if (low < high) {
            int partition = partition(array, low, high);
            quickSort(array, low, partition - 1);
            quickSort(array, partition + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int minPosition = low - 1;
        int pivot = array[high];

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                minPosition++;
                int temp = array[j];
                array[j] = array[minPosition];
                array[minPosition] = temp;
            }
        }
        int temp = array[high];
        array[high] = array[minPosition + 1];
        array[minPosition + 1] = temp;

        return minPosition + 1;
    }
}
