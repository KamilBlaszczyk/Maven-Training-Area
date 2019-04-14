package com.blaszczyk.implementation;

import com.blaszczyk.api.IVehicles;
import com.blaszczyk.api.Vehicle;

public class Plane extends Vehicle implements IVehicles {

    public Plane(String manufacturer, int maxSpeed) {
        super(manufacturer, maxSpeed);
    }
}

