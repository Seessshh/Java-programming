package com.sushil.Inheritance;

import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        double r = sc.nextDouble();

        System.out.print("Enter the height : ");
        double h = sc.nextDouble();

        if (r>1 && h>1)
        {
            Cylinder c = new Cylinder(r,h);
            System.out.println("Volume : "+ c.getVolume());
            System.out.println("Area : "+c.getArea());
        }
        else
            System.err.println("Error Invalid Input");
    }
}
