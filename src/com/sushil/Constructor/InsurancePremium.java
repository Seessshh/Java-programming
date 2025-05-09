package com.sushil.Constructor;

public class InsurancePremium {
    private double premiumAmount;


    public InsurancePremium(double premium) {
        this.premiumAmount = premium;
    }


    public double getPremiumAmount() {
        return this.premiumAmount;
    }


    public static InsurancePremium calculatePremium(Vehicle vehicle) {


        double premium = 0;
        String vtype = vehicle.getVehicleType();
        int age = vehicle.getVehicleAge();

        if (vtype.equalsIgnoreCase("Car")) {
            if (vehicle.getVehicleAge() < 5) {
                premium = 5;
            } else if (age >= 5 && age <= 10) {
                premium = 7;
            } else {
                premium = 10;
            }
        } else if (vtype.equalsIgnoreCase("Motorcycle")) {
            if (age < 3) {
                premium = 3;
            } else if (age >= 3 && age <= 8) {
                premium = 5;
            } else {
                premium = 8;
            }
        } else if (vtype.equalsIgnoreCase("Truck")) {
            if (age < 5) {
                premium = 6;
            } else if (age >= 5 && age <= 10) {
                premium = 8;
            } else {
                premium = 12;
            }
        }

        return new InsurancePremium(premium);
    }
}







