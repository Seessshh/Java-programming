package com.sushil.Exam_28_12;

public class PayrollSystem
{
    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee(101,"Alice",50000);
        f.showDetails();
        f.calculateSalary();

        PartTimeEmployee p =new PartTimeEmployee(102,"Bob",200,25);
        p.showDetails();
        p.calculateSalary();
    }
}
