package com.dusinski.sortcompare.sort;

public class CountSort implements SortAlgorithm {
    private int minElement = Integer.MAX_VALUE;
    private int maxElement = Integer.MIN_VALUE;


    public void sort(int[] inputArray) {
        countSort(inputArray);
    }

    private void findMinMaxElement(int[] array) {
        for (int j : array) {
            if (j < minElement) {
                minElement = j;
            }
            if (j > maxElement) {
                maxElement = j;
            }
        }
    }

    private void countSort(int[] inputArray) {
        findMinMaxElement(inputArray);
        System.out.println("min element: "+minElement);
        System.out.println("max element: "+maxElement);
        byte[] histogramArrayNegativePart = new byte[Math.abs(minElement) + 1];
        byte[] histogramArrayPositivePart = new byte[maxElement + 1];

        for (int i : inputArray) {
            if (i < 0) {
                histogramArrayNegativePart[Math.abs(i)]++;
            } else {
                histogramArrayPositivePart[i]++;
            }
        }

        int inputArrayCounter = 0;

        int histogramNegativeCounter = histogramArrayNegativePart.length - 1;
        while (histogramNegativeCounter > 0) {
            if (histogramArrayNegativePart[histogramNegativeCounter] > 0) {
                histogramArrayNegativePart[histogramNegativeCounter]--;
                inputArray[inputArrayCounter] = -histogramNegativeCounter;
                inputArrayCounter++;
            } else {
                histogramNegativeCounter--;
            }

        }

        int histogramPositiveCounter = 0;
        while (histogramPositiveCounter < histogramArrayPositivePart.length) {
            if (histogramArrayPositivePart[histogramPositiveCounter] > 0) {
                histogramArrayPositivePart[histogramPositiveCounter]--;
                inputArray[inputArrayCounter] = histogramPositiveCounter;
                inputArrayCounter++;
            } else {
                histogramPositiveCounter++;
            }

        }
    }

}
