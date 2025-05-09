package com.sushil.Exam;

public class StandardReservation extends Reservation {
    public StandardReservation(String reservationType, int nights) {
        super(reservationType, nights);
    }

    @Override
    public double calculateCost() {
        return nights * 2000;
    }
}

