package com.dusinski.sortcompare.compare;

import java.util.Comparator;

public class VehicleAxesComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v2.getAxesCount()-v1.getAxesCount();
    }
}
