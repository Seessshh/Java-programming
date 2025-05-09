package com.sushil.Constructor;

import java.util.Scanner;

public class CarRentalCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the car model");
        String carModal = sc.nextLine();
        System.out.println("Enter the rental days ");
        int rentalDays = sc.nextInt();
        System.out.println("Enter the daily rate");
        double dailyRate = sc.nextDouble();

        CarRental c1 = new CarRental(carModal, rentalDays, dailyRate);

        //  c1.CalculateTotalCost();
        c1.GetCarRental(carModal, rentalDays, dailyRate);

    }
}
