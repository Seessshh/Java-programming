package com.sushil.Constructor;

public class BlcEmployee {
    private String empName;
    private String department;
    private double baseSalary;
    private int performanceScore;

    BlcEmployee(String empName, String department, double baseSalary, int performanceScore) {
        this.empName = empName;
        this.department = department;
        this.baseSalary = baseSalary;
        this.performanceScore = performanceScore;
    }

    public double calculateBonus() {

        if (performanceScore >= 8 && performanceScore <= 10)
            return baseSalary + baseSalary * 0.20;
        else if (performanceScore >= 5 && performanceScore <= 7)
            return baseSalary + baseSalary * 0.10;
        else if (performanceScore < 5) {
            System.out.println("Chus lo manager ka");
            return baseSalary;
        }
        return baseSalary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    public void Getemp(String empName, String department, double baseSalary, int performanceScore) {
        System.out.println("The name of the employee is : " + empName);
        System.out.println("The department name of the employee is : " + department);
        System.out.println("Base salary of that employee is : " + baseSalary);
        System.out.println("Performance score of the employee is : " + performanceScore);
        System.out.println("Salary of the employee after the bonus is : " + calculateBonus());
    }
}
