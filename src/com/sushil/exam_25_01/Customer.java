package com.sushil.exam_25_01;

public class Customer
{
    private String name;
    private HolidayPackageClass reservedPackage;

    public Customer(String name, HolidayPackageClass reservedPackage) {
        this.name = name;
        this.reservedPackage = reservedPackage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HolidayPackageClass getReservedPackage() {
        return reservedPackage;
    }

    public void setReservedPackage(HolidayPackageClass reservedPackage) {
        this.reservedPackage = reservedPackage;
    }
}
