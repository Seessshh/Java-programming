package com.sushil.Constructor;

public class EmployeeBlc {
    int empnum;
    String empName;
    double salary;

    EmployeeBlc(int empnum, String empName, double salary) {
        this.empnum = empnum;
        this.empName = empName;
        this.salary = salary;
    }

    public void designation() {
        if (salary >= 60000)
            System.out.println("Employee is a developer");
        else if (salary >= 40000 && salary <= 60000)
            System.out.println("Employee is a Designer");
        else if (salary < 40000 && salary > 0)
            System.out.println("Employee is a Tester");
        else
            System.out.println("Salary input is invalid");

    }

    public void display() {
        System.out.println("Employee number is : " + empnum);
        System.out.println("Employee name is : " + empName);
        System.out.println("Employee salary is : " + salary);
    }
}
