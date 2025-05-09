package com.sushil.Constructor;


public class VehicleInsuranceTest {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("Car", 6);

        System.out.println(v);

        InsurancePremium p = InsurancePremium.calculatePremium(v);
        System.out.println("Insurance Premium: " + p.getPremiumAmount() +  "% of vehicle value");
    }
}