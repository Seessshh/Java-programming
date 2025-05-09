package com.sushil.Constructor;

import java.util.Scanner;

public class EmployeeTester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee number");
        int empnum = sc.nextInt();
        System.out.println("Enter the employee name");
        String empName = sc.nextLine();
        empName = sc.nextLine();

        System.out.println("Enter the employee salary");
        int salary = sc.nextInt();

        EmployeeBlc e = new EmployeeBlc(empnum, empName, salary);
        e.display();
        e.designation();
    }
}
