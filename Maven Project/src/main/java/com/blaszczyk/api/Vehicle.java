package com.blaszczyk.api;

public class Vehicle {

    private String manufacturer;
    private int maxSpeed;

    public Vehicle(String manufacturer, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
