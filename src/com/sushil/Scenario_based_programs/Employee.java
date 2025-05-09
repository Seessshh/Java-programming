package com.sushil.Scenario_based_programs;

import java.util.Scanner;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public Employee(int employeeId, String employeeName, double employeeSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public static Employee getEmployeeObject()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Employee ID : ");
        int id = sc.nextInt();
        while(id<0) {
            System.out.println("Invalid input. Employee ID must be a positive integer.");
            System.out.print("Enter the Employee ID : ");
            id = sc.nextInt();
        }


        System.out.print("Enter the name of the employee : ");
        String name = sc.nextLine();
        name = sc.nextLine();
        while(name.equals("")) {
            System.out.println("Invalid input. Name of the employee cant be null.");
            System.out.print("Enter the name of the employee : ");
             name = sc.nextLine();
        }


        System.out.print("Enter the salary of the Employee : ");
        double sal = sc.nextDouble();
        while(sal<0){
            System.out.println("Invalid input. Salary of the employee cant be negative ");
            System.out.print("Enter the salary of the Employee : ");
             sal = sc.nextDouble();
        }

        Employee e1 = new Employee(id,name,sal);
        return e1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
