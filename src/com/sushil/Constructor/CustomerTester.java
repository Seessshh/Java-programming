package com.sushil.Constructor;

import java.util.Scanner;

public class CustomerTester {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the name of the customer ");
        String customerName = sc.nextLine();
        System.out.println("Enter the monthly spending ");
        double monthlySpending = sc.nextDouble();

        Customer c = new Customer(customerName,monthlySpending);
        c.displayDetails();
        CardType c1 = new CardType();
        c1.getCardTypes(c.getMonthlySpending());
        System.out.println("Card type : "+c1.getCardName());

    }
}
