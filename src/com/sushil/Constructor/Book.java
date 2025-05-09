package com.sushil.Constructor;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private double discountPercentage;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void GetDetails(String title, String author, String isbn, double price, double discountPercentage) {
        System.out.println("The title of the book is " + title);
        System.out.println("The author of the book id " + author);
        System.out.println("The isbn of the book is " + isbn);
        System.out.println("The price of the book is " + price);
        System.out.println("The discount percentage to the book is " + discountPercentage);
        System.out.println("Price after applying discount is : " + GetFinalPrice(price,discountPercentage));
    }

    public double GetFinalPrice(double price, double discountPercentage) {
        return (double) (price - price * discountPercentage / 100);
    }


}
