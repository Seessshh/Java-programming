package com.sushil.Constructor;

public class Customer {
    private String customerName;
    private double monthlySpending;

    public Customer(String customerName, double monthlySpending) {
        this.customerName = customerName;
        this.monthlySpending = monthlySpending;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public void setMonthlySpending(double monthlySpending)
    {
        this.monthlySpending = monthlySpending;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getMonthlySpending() {
        return monthlySpending;
    }

    public void displayDetails()
    {
        System.out.println("Customer name is : "+customerName);
        System.out.println("Monthly spending of the customer is : "+monthlySpending);
    }
}
