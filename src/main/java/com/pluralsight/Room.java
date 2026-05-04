package com.pluralsight;

public class Room {
    // attributes
    private int numBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    //constructor
    public Room(int numBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numBeds = numBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    // getters
    public int getNumBeds() {
        return numBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
