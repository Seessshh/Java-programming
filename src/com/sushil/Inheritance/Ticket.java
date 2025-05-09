package com.sushil.Inheritance;

public class Ticket {

    private String eventName;
    private int seatNum;
    private double price;

    public Ticket(String eventName, int seatNum, double price) {
        this.eventName = eventName;

        if (seatNum >0)
        this.seatNum = seatNum;
        else
            System.err.println("Invalid input");
        if (price >0)
        this.price = price;
        else
            System.err.println("Invalid input");
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails()
    {
        System.out.println("Regular Ticket : ");
        System.out.println("Event : "+this.eventName);
        System.out.println("Seat number : "+this.seatNum);
        System.out.println("Price : $ "+this.price);
    }
}
