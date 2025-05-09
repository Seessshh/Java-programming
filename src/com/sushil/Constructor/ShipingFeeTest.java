package com.sushil.Constructor;

import java.util.Scanner;

public class ShipingFeeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the package weight to ship ");
        double weight = sc.nextDouble();
        System.out.println("Enter the distance to travel ");
        int distance = sc.nextInt();

        Shiping s = new Shiping(weight,distance);
        System.out.println(s);

        ShippingFee s1 =ShippingFee.calculateFee(s);
        System.out.println("Shipping fee : "+s1.getFeeAmount());
    }
}
