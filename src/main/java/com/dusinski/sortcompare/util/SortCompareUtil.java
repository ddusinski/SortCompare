package com.dusinski.sortcompare.util;

import com.dusinski.sortcompare.sort.CountSort;
import com.dusinski.sortcompare.sort.MergeSort;
import com.dusinski.sortcompare.sort.QuickSort;
import com.dusinski.sortcompare.sort.SortAlgorithm;
import org.apache.commons.lang3.time.StopWatch;

import java.util.Random;

public class SortCompareUtil {

    public final int[] testArr;

    public SortCompareUtil(int n) {
        this.testArr = getRandomArray(n);
//        this.testArr = new int[]{-12, 23, 44, -14};
//        this.testArr = new int[]{-12, 23, -44, 14};
    }

    public int[] getUnsortedArray() {
        return this.testArr;
    }

    private int[] getRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private int[] checkSort(SortAlgorithm sa) {
        int[] test = testArr.clone();
        StopWatch sw = new StopWatch();
        sw.start();

        System.out.println(sa.getClass().getCanonicalName());
        System.out.println("heap size before: " + Runtime.getRuntime().totalMemory() / 1024 / 1024 + " MB");
//        System.out.println("before sort: " + Arrays.toString(test));
        sa.sort(test);
//        System.out.println("after sort: " + Arrays.toString(test));
        sw.stop();
        System.out.println("heap size after: " + Runtime.getRuntime().totalMemory() / 1024 / 1024 + " MB");
        System.out.println("Nano-time Elapsed: " + sw.getTime());
        return test;
    }

    public int[] checkMergeSort() {
        return checkSort(new MergeSort());

    }

    public int[] checkCountSort() {
        return checkSort(new CountSort());
    }

    public int[] checkQuickSort() {
        return checkSort(new QuickSort());
    }

}
