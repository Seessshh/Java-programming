package com.sushil.Exam;

public class Customer {
    private String name;
    private String contactNumber;
    private Reservation reservation;

    public Customer(String name, String contactNumber, Reservation reservation) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.reservation = reservation;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Reservation Type: " + reservation.reservationType);
        System.out.println("Number of Nights: " + reservation.nights);

        if (reservation instanceof DeluxReservation) {
            double totalCost = reservation.calculateCost();
            System.out.println("Total Cost: " + totalCost);
        }

        if (reservation instanceof StandardReservation)
        {
            double totalCost = reservation.calculateCost();
            System.out.println("Total Cost: " + totalCost);
        }
    }
}
