package com.sushil.Polymorphism;

public class Employee {

    private int hoursworked;
    private double hourlyRate;
    private double annualSalary;
    private double salesAmount;
    private double commissionRate;

    public Employee(int hoursworked, double hourlyRate) {
        this.hoursworked = hoursworked;
        this.hourlyRate = hourlyRate;
    }

    public Employee(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Employee(double salesAmount, double commissionRate) {
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    public double calculateSalary()
    {
        double sal = hoursworked*hourlyRate;
        System.out.print("Monthly salary of hourly employee: ");
        return sal;
    }

    public double calculateSalary( double annualSalary)
    {
        double sal = annualSalary/12;
        System.out.print("Monthly salary of salaried employee: ");
        return sal;
    }
    public double calculateSalary( double salesAmount,double commissionRate)
    {
        double sal = salesAmount*commissionRate;
        System.out.print("Commission of employee: ");
        return sal;
    }
}
