package com.sushil.Exam;

public class HotelReservationSystem {

    public static void main(String[] args) {


        Reservation standardReservation = new StandardReservation("Standard", 4);
        Reservation deluxeReservation = new DeluxReservation("Deluxe", 5);


        Customer customer1 = new Customer("Sushil", "9226087295", standardReservation);
        Customer customer2 = new Customer("Sanket", "9309720084", deluxeReservation);


        System.out.println("Customer 1 Details:");
        customer1.displayCustomerDetails();
        System.out.println();

        System.out.println("Customer 2 Details:");
        customer2.displayCustomerDetails();


    }
}
