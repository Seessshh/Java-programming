package com.sushil.Constructor;

import java.util.Scanner;

public class InventoryMain {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name of the item");
        String name = sc.nextLine();
        System.out.println("Enter the price of per item ");
        int price = sc.nextInt();
        System.out.println("Enter the quantity available in stock ");
        double quantity = sc.nextDouble();
        Inventory i = new Inventory(name,quantity,price);
        System.out.println("Total values of "+name+" in stock : "+i.calculateTotalValue());
    }
}
