package com.dusinski.sortcompare;

import com.dusinski.sortcompare.sort.HeapArraySort;
import com.dusinski.sortcompare.sort.SortAlgorithm;
import com.dusinski.sortcompare.util.SortCompareUtil;

import java.util.Arrays;

/**
 * Sort compare
 */
public class App {
    public static void main(String[] args) {


        SortAlgorithm sa = new HeapArraySort();
        SortCompareUtil scu = new SortCompareUtil(1000000);

        int[] testArray = {5, 3, 6, -1};
        testArray = scu.getUnsortedArray();

//        System.out.println(Arrays.toString(testArray));
//        sa.sort(testArray);

//        System.out.println(Arrays.toString(scu.checkHeapArraySort()));
        scu.checkHeapArraySort();
        scu.checkMergeSort();
        scu.checkQuickSort();
        scu.checkCountSort();
    }
}
