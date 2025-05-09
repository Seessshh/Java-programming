package com.sushil.Scenario_based_programs;

import java.util.Scanner;

public class EmployeeElc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employee object : ");
        int num = sc.nextInt();

        Employee[] a = new Employee[num];

        for (int i = 0;i<num;i++)
        {
            System.out.println("------------------------------------------------------------------------------");
           a[i] = Employee.getEmployeeObject();

        }
        for (Employee employee : a) {
            System.out.println(employee);

        }
    }
}
