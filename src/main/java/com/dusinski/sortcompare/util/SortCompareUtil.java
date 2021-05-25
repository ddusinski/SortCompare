package com.dusinski.sortcompare.util;

import com.dusinski.sortcompare.sort.CountSort;
import com.dusinski.sortcompare.sort.MergeSort;
import com.dusinski.sortcompare.sort.SortAlgorithm;
import org.apache.commons.lang3.time.StopWatch;

import java.util.Arrays;
import java.util.Random;

public class SortCompareUtil {

    private final int[] testArr;

    public SortCompareUtil(int n) {
        this.testArr = getRandomArray(n);
    }

    private int[] getRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private void checkSort(SortAlgorithm sa) {
        StopWatch sw = new StopWatch();
        sw.start();

        System.out.println(sa.getClass().getCanonicalName());
        System.out.println("heap size before: " + Runtime.getRuntime().totalMemory() / 1024 / 1024 + " MB");
        System.out.println("before sort: " + Arrays.toString(testArr));
        sa.sort(testArr);
        System.out.println("after sort: " + Arrays.toString(testArr));
        sw.stop();
        System.out.println("heap size after: " + Runtime.getRuntime().totalMemory() / 1024 / 1024 + " MB");
        System.out.println("Nano-time Elapsed: " + sw.getTime());
    }

    public void checkMergeSort() {
        checkSort(new MergeSort());
    }

    public void checkCountSort() {
        checkSort(new CountSort());
    }

}
