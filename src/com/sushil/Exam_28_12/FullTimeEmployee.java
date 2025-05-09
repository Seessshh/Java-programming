package com.sushil.Exam_28_12;

public class FullTimeEmployee extends Employee
{
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public void showDetails()
    {
        System.out.println("Full-Time Employee Details :");
        System.out.println("Employee ID:"+this.getEmployeeId());
        System.out.println("Name : "+this.getName());
    }

    @Override
    void calculateSalary()
    {
        System.out.println("Monthly Salary : "+this.monthlySalary);
        System.out.println("Calculated Salary :"+this.monthlySalary);
    }



}
