package com.sushil.Constructor;

 public class EmployeeeBlc{
    private String name;
    private String department;
    private int age;
    private double salary;
    private String performance;

    EmployeeeBlc(String name,int age, String department, double salary, String performance)
    {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public double updateSalary()
    {
        if (this.performance=="good")
            return salary+10000;
        else if (this.performance=="average")
            return salary+5000;
        else
            return salary;
    }


 }
