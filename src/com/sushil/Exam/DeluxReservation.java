package com.sushil.Exam;

public class DeluxReservation extends Reservation {
    public DeluxReservation(String reservationType, int nights) {
        super(reservationType, nights);
    }

    @Override
    public double calculateCost() {
        return nights * 4000;
    }
}
