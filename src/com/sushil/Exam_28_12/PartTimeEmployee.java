package com.sushil.Exam_28_12;

public class PartTimeEmployee extends Employee
{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void showDetails()
    {
        System.out.println("Part-Time Employee Details: ");
        System.out.println("Employee ID:"+this.getEmployeeId());
        System.out.println("Name : "+this.getName());
    }


    @Override
    void calculateSalary()
    {
        System.out.println("Hourly Rate :"+this.hourlyRate);
        System.out.println("Hours worked :"+this.hoursWorked);
        System.out.println("Calculated Salary:"+(this.hoursWorked*this.hourlyRate));
    }
}
