package com.sushil.Constructor;

public class Product {
    private String productName;
    private int productId;
    private double price;

    Product ()
    {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }

    public Product(String productName, int productId, double price) {
        if (productName==null)
            System.out.println("Product name cannot be null or empty.");
        else
            this.productName = productName;
        if (productId<0)
            System.out.println("Product ID cannot be negative.");
        else
            this.productId = productId;
        if (price<0)
            System.out.println("Price cannot be negative.");
        else
            this.price = price;
    }

    public void display_info()
    {
        System.out.println("Name of the product is : "+productName);
        System.out.println("Id of the product is : "+productId);
        System.out.println("Price of the product is : "+price);
    }
}
