package com.dusinski.sortcompare;

import com.dusinski.sortcompare.util.SortCompareUtil;

/**
 * Sort compare
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Sort Compare App");
        SortCompareUtil sortCompareUtil = new SortCompareUtil(10000);
        sortCompareUtil.checkMergeSort();

    }
}
