package com.sushil.Inheritance;

public class VipTicket extends Ticket{

    private String specialAccess;

    public VipTicket(String eventName, int seatNum, double price, String specialAccess) {
        super(eventName, seatNum, price);
        this.specialAccess = specialAccess;
    }

    public String getSpecialAccess() {
        return specialAccess;
    }

    public void setSpecialAccess(String specialAccess) {
        this.specialAccess = specialAccess;
    }

    public void displayDetails()
    {
        System.out.println("VIP Ticket : ");
        System.out.println("Event : "+getEventName());
        System.out.println("Seat number : "+getSeatNum());
        System.out.println("Price : $ "+getPrice());
        System.out.println("Special Access : "+this.specialAccess);
    }
}
