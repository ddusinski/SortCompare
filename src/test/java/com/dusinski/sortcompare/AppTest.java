package com.dusinski.sortcompare;

import com.dusinski.sortcompare.compare.Vehicle;
import com.dusinski.sortcompare.compare.VehicleAxesComparator;
import com.dusinski.sortcompare.compare.VehicleSeatsComparator;
import com.dusinski.sortcompare.util.SortCompareUtil;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class AppTest {

//        @Test
//    public void testCountSort(){
//        SortCompareUtil sortCompareUtil = new SortCompareUtil(1000);
//        int[] testArray =  sortCompareUtil.getUnsortedArray().clone();
//        Arrays.sort(testArray);
//        assertArrayEquals(testArray,sortCompareUtil.checkCountSort());
//    }
    @Test
    public void testMergeSort() {
        SortCompareUtil sortCompareUtil = new SortCompareUtil(1000);
        int[] testArray = sortCompareUtil.getUnsortedArray().clone();
        Arrays.sort(testArray);
        assertArrayEquals(testArray, sortCompareUtil.checkMergeSort());
    }

    @Test
    public void testQuickSort() {
        SortCompareUtil sortCompareUtil = new SortCompareUtil(1000);
        int[] testArray = sortCompareUtil.getUnsortedArray().clone();
        Arrays.sort(testArray);
        assertArrayEquals(testArray, sortCompareUtil.checkQuickSort());
    }

    @Test
    public void testHeapArraySort() {
        SortCompareUtil sortCompareUtil = new SortCompareUtil(1000);
        int[] testArray = sortCompareUtil.getUnsortedArray().clone();
        Arrays.sort(testArray);
        assertArrayEquals(testArray, sortCompareUtil.checkHeapArraySort());
    }

    // sorting using compareTo inside Vehicle class - seatsCount is taken into account
    @Test
    public void comparableTest() {
        Vehicle bike = new Vehicle("bike", 1, 1);
        Vehicle motorbike = new Vehicle("motorbike", 1, 2);
        Vehicle car = new Vehicle("car", 2, 5);
        Vehicle bus = new Vehicle("bus", 2, 5);
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(bus);
        vehicleList.add(motorbike);
        vehicleList.add(car);
        vehicleList.add(bike);
        Collections.sort(vehicleList);
        assertEquals("[Vehicle{name='bike', axesCount=1, seatsCount=1}, Vehicle{name='motorbike', axesCount=1, seatsCount=2}, Vehicle{name='bus', axesCount=2, seatsCount=5}, Vehicle{name='car', axesCount=2, seatsCount=5}]",
                vehicleList.toString());

    }

    @Test
    public void comparatorTest() {
        Vehicle bike = new Vehicle("bike", 1, 2);
        Vehicle car = new Vehicle("car", 2, 5);
        Vehicle bus = new Vehicle("bus", 3, 12);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(bus);
        vehicleList.add(car);
        vehicleList.add(bike);


        Comparator<Vehicle> seats = new VehicleSeatsComparator();
        Comparator<Vehicle> axes = new VehicleAxesComparator();

        Collections.sort(vehicleList, axes);
        assertEquals("[Vehicle{name='bus', axesCount=3, seatsCount=12}, Vehicle{name='car', axesCount=2, seatsCount=5}, Vehicle{name='bike', axesCount=1, seatsCount=2}]",
                vehicleList.toString());
        Collections.sort(vehicleList, seats);
        assertEquals("[Vehicle{name='bus', axesCount=3, seatsCount=12}, Vehicle{name='car', axesCount=2, seatsCount=5}, Vehicle{name='bike', axesCount=1, seatsCount=2}]",
                vehicleList.toString());
    }
}
