package com.sushil.Exam;

public class Reservation {
    protected String reservationType;
    protected int nights;

    public Reservation(String reservationType, int nights) {
        this.reservationType = reservationType;
        this.nights = nights;
    }

    public double calculateCost() {
        return 0.0;
    }

    public void displayReservationDetails() {
        System.out.println("Reservation Type: " + reservationType);
        System.out.println("Number of Nights: " + nights);
    }
}

