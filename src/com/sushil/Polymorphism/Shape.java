package com.sushil.Polymorphism;

public class Shape {
    public static void main(String[] args) {

        ShapeCalculator s = new ShapeCalculator();
        s.calculateArea(7.0);
        s.calculateArea(-5);
        s.calculateArea(-5,10);
    }
}
