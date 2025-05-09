package com.sushil.Inheritance;

public class TicketTester {
    public static void main(String[] args) {


        Ticket t = new Ticket("concert",101,50);
        t.displayDetails();

        VipTicket v = new VipTicket("VIP concert",201,100,"Backstage Access");
        v.displayDetails();

        StudentTicket S = new StudentTicket("Student event",301,30,true);
        S.displayDetails();
    }
}
