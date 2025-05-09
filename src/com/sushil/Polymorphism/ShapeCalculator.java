package com.sushil.Polymorphism;

public class ShapeCalculator {

    public int calculateArea(int sideLength) {
        int area = sideLength * sideLength;
        if (sideLength > 0)
        System.out.println("Area of square with side length  " + sideLength + " : " + area);
        else System.err.println("Side length must be non-negative.");
        return area;
    }

    public int calculateArea(int length, int width) {
        int area = length * width;
        if (length > 0 && width > 0)
        System.out.println("Area of rectangle with lenght  " + length + "and width" + width + " : " + area);
        else
            System.err.println("Length and width must be non-negative.");
        return area;
    }

    public double calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        if (radius > 0)
        {
            System.out.println("Area of circle with radius  " + radius + " : " + area);
        }
        else
            System.err.println("Radius must not be negative");
        return area;
    }


}
