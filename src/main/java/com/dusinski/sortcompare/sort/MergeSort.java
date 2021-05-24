package com.dusinski.sortcompare.sort;

public class MergeSort implements SortAlgorithm {

    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void merge(int[] arr, int leftPointer, int midPointer, int rightPointer) {
        int[] leftArr = new int[midPointer - leftPointer + 1];
        int[] rightArr = new int[rightPointer - midPointer];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[leftPointer + i];
        }

        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = arr[midPointer + 1 + i];
        }

        int leftPosition = 0;
        int rightPosition = 0;
        int mainPosition = leftPointer;

        while (leftPosition < leftArr.length && rightPosition < rightArr.length) {

            if (leftArr[leftPosition] > rightArr[rightPosition]) {
                arr[mainPosition] = rightArr[rightPosition];
                rightPosition++;
            } else {
                arr[mainPosition] = leftArr[leftPosition];
                leftPosition++;
            }
            mainPosition++;
        }

        while (leftPosition < leftArr.length) {
            arr[mainPosition] = leftArr[leftPosition];
            leftPosition++;
            mainPosition++;
        }

        while (rightPosition < rightArr.length) {
            arr[mainPosition] = rightArr[rightPosition];
            rightPosition++;
            mainPosition++;
        }
    }

    private void mergeSort(int[] arr, int leftPointer, int rightPointer) {
        if (leftPointer < rightPointer) {
            int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            mergeSort(arr, leftPointer, midPointer);
            mergeSort(arr, midPointer + 1, rightPointer);
            merge(arr, leftPointer, midPointer, rightPointer);
        }
    }
}
