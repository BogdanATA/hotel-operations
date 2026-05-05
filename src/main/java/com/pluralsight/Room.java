package com.pluralsight;

public class Room {
    // attributes
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //constructor
    public Room(int numBeds, double price) {
        this.numberOfBeds = numBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;

    }

    // getters
    public int getNumBeds() {
        return numberOfBeds;
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

    public boolean isAvailable() {  //if its not dirty and avaiable it should be set to true
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        if(isAvailable()){
            isOccupied = true;
            isDirty = true;
        }
    }

    public void checkOut() {
        isOccupied = false;
    }

    public void cleanRoom() {
        if(isOccupied) {
            isDirty = false;
        }
    }
}
