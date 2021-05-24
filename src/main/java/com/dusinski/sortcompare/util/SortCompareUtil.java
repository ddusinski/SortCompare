package com.dusinski.sortcompare.util;

import com.dusinski.sortcompare.sort.MergeSort;
import com.dusinski.sortcompare.sort.SortAlgorithm;
import org.apache.commons.lang3.time.StopWatch;

import java.util.Arrays;
import java.util.Random;

public class SortCompareUtil {

    private static int ARRAY_SIZE;

    public SortCompareUtil(int n){
        ARRAY_SIZE=n;
    }

    private int[] getRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private void checkSort(int arraySize, SortAlgorithm sa) {
        StopWatch sw = new StopWatch();
        sw.start();
        int[] testArr = getRandomArray(arraySize);
        System.out.println(MergeSort.class.getCanonicalName());
        System.out.println("before sort: " + Arrays.toString(testArr));
        sa.sort(testArr);
        System.out.println("after sort: " + Arrays.toString(testArr));
        sw.stop();
        System.out.println("Nano-time Elapsed: " + sw.getTime());
    }

    public void checkMergeSort() {
        checkSort(ARRAY_SIZE, new MergeSort());
    }

}
