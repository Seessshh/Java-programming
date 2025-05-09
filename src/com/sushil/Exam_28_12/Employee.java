package com.sushil.Exam_28_12;

public abstract class Employee
{
    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void showDetails()
    {
        System.out.println("Employee ID:"+this.employeeId);
        System.out.println("Name : "+this.name);
    }

    abstract void calculateSalary();
}
