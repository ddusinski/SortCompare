package com.dusinski.sortcompare;

import static org.junit.Assert.*;

import com.dusinski.sortcompare.util.SortCompareUtil;
import org.junit.Test;

import java.util.Arrays;


public class AppTest 
{

//    @Test
//    public void testCountSort(){
//        SortCompareUtil sortCompareUtil = new SortCompareUtil(1000);
//        int[] testArray =  sortCompareUtil.getUnsortedArray().clone();
//        Arrays.sort(testArray);
//        assertArrayEquals(testArray,sortCompareUtil.checkCountSort());
//    }
    @Test
    public void testMergeSort(){
        SortCompareUtil sortCompareUtil = new SortCompareUtil(1000);
        int[] testArray =  sortCompareUtil.getUnsortedArray().clone();
        Arrays.sort(testArray);
        assertArrayEquals(testArray,sortCompareUtil.checkMergeSort());
    }
    @Test
    public void testQuickSort(){
        SortCompareUtil sortCompareUtil = new SortCompareUtil(1000);
        int[] testArray =  sortCompareUtil.getUnsortedArray().clone();
        Arrays.sort(testArray);
        assertArrayEquals(testArray,sortCompareUtil.checkQuickSort());
    }

}
