package com.sushil.Constructor;

import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of the book ");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book ");
        String author = sc.nextLine();
        System.out.println("Enter the isbn of the book ");
        String isbn = sc.nextLine();
        System.out.println("Enter the price of the book ");
        double price = sc.nextDouble();
        System.out.println("Enter the discount on the book ");
        double discountPercentage = sc.nextDouble();
        Book b = new Book();
        b.GetDetails(title, author, isbn, price, discountPercentage);
        //System.out.println(b.GetFinalPrice(price,discountPercentage));
    }
}
