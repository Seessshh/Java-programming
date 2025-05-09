package com.sushil.Constructor;

public class EmployeeBonus {
    private String employeeName;
    private double basicSalary;
    private int performanceRating;

    public EmployeeBonus(String employeeName, double basicSalary, int performanceRating) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.performanceRating = performanceRating;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    @Override
    public String toString() {
        return "EmployeeBonus{" +
                "employeeName='" + employeeName + '\'' +
                ", basicSalary=" + basicSalary +
                ", performanceRating=" + performanceRating +
                '}';
    }

}
