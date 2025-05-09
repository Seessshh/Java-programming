package com.sushil.Constructor;

public class CarRental {
    private String carModel;
    private int rentalDays;
    private double dailyRate;


    CarRental(String carModel, int rentalDays, double dailyRate) {
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double CalculateTotalCost() {
        double cost = (dailyRate * rentalDays);
        if (rentalDays > 7) {

            double discount = cost * 10 / 100.0;
            double totalCost = cost - discount;
            return totalCost;
        } else {
            System.out.println("there is no discount ");
            return cost;
        }
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void GetCarRental(String carModel, int rentalDays, double dailyRate) {
        System.out.println("Car model is :" + carModel);
        System.out.println("Rental days are :" + rentalDays);
        System.out.println("Daily rate is :" + dailyRate);
        System.out.println("After discount rate : " + CalculateTotalCost());
    }
}
