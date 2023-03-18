package com.driver;

public class Boat implements WaterVehicle {
    public String name ="kumar";
    public int capacity = 6;
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
