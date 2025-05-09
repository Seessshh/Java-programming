package com.sushil.Constructor;


public class Vehicle {
    private String vehicleType;
    private int vehicleAge;


    public Vehicle(String type, int age) {
        this.vehicleType = type;
        this.vehicleAge = age;
    }


    public void setVehicleType(String type) {
        this.vehicleType = type;
    }

    public void setVehicleAge(int age) {
        this.vehicleAge = age;
    }


    public String getVehicleType() {
        return this.vehicleType;
    }

    public int getVehicleAge() {
        return this.vehicleAge;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", vehicleAge=" + vehicleAge +
                '}';
    }
}