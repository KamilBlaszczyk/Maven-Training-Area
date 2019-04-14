package com.blaszczyk.implementation;

import com.blaszczyk.api.IVehicles;
import com.blaszczyk.api.Vehicle;

public class Bicycle extends Vehicle implements IVehicles {

    public Bicycle(String manufacturer, int maxSpeed) {
        super(manufacturer, maxSpeed);
    }
}
