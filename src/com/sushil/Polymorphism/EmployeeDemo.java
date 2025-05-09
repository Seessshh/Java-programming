package com.sushil.Polymorphism;

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e = new Employee(160,15);
        System.out.println(e.calculateSalary());
        Employee e1 = new Employee(60000);
        System.out.println(e1.calculateSalary());
        Employee e2 = new Employee(50000.0,0.10);
        System.out.println(e2.calculateSalary());

    }
}
