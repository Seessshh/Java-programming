package com.sushil.Constructor;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the employee");
        String empName = sc.nextLine();
        System.out.println("Enter the department of the employee");
        String department = sc.nextLine();
        System.out.println("Enter the base salary of the employee");
        double salary = sc.nextDouble();
        System.out.println("Enter the performance Score of the employee between 1 to 10");
        int performanceScore = sc.nextInt();

        BlcEmployee b = new BlcEmployee(empName, department, salary, performanceScore);
        b.Getemp(empName, department, salary, performanceScore);
    }
}
