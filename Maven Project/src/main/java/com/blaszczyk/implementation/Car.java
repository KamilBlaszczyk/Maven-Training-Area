package com.blaszczyk.implementation;

import com.blaszczyk.api.IVehicles;
import com.blaszczyk.api.Vehicle;

public class Car extends Vehicle implements IVehicles {

    public Car(String manufacturer, int maxSpeed) {
        super(manufacturer, maxSpeed);
    }
}
