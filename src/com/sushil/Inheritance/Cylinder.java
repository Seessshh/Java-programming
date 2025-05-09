package com.sushil.Inheritance;

public class Cylinder extends Circle{

    double height;

    public Cylinder()
    {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getVolume()
    {
        double v = getArea() * height;
        return v;
    }



}
