package com.sushil.Inheritance;

public class StudentTicket extends Ticket{

    private boolean studentDiscount;

    public StudentTicket(String eventName, int seatNum, double price, boolean studentDiscount) {
        super(eventName, seatNum, price);
        this.studentDiscount = studentDiscount;
    }

    public boolean isStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(boolean studentDiscount) {
        this.studentDiscount = studentDiscount;
    }

    public void displayDetails()
    {
        System.out.println("Student Ticket : ");
        System.out.println("Event : "+getEventName());
        System.out.println("Seat number : "+getSeatNum());
        System.out.println("Price : $ "+getPrice());
        System.out.println("Student Discount : "+this.studentDiscount);
    }
}
