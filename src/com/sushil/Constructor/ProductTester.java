package com.sushil.Constructor;

import java.util.Scanner;

public class ProductTester {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the name of the product ");
        String productName = sc.nextLine();
        System.out.println("Enter the id of the product ");
        int productId = sc.nextInt();
        System.out.println("Enter price of the product ");
        double price = sc.nextDouble();
        Product p =new Product(productName,productId,price);
        p.display_info();
    }
}
