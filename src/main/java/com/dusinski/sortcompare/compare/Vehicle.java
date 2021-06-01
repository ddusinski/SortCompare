package com.dusinski.sortcompare.compare;

public class Vehicle implements Comparable<Vehicle> {
    private final String name;
    private final int axesCount;
    private final int seatsCount;

    public Vehicle(String name, int axesCount, int seatsCount) {
        this.name = name;
        this.axesCount = axesCount;
        this.seatsCount = seatsCount;
    }

    public String getName() {
        return name;
    }

    public int getAxesCount() {
        return axesCount;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", axesCount=" + axesCount +
                ", seatsCount=" + seatsCount +
                '}';
    }

    @Override
    public int compareTo(Vehicle inputVehicle) {
        return this.seatsCount - inputVehicle.seatsCount;
    }
}
