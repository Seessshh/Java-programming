package com.sushil.HasA_Relation;

public class TaxUtil {

    public static double CalculateTax(Employee e) {
        double grossSalary = e.calculateGrossSalary();
        return calculateNetSalary(grossSalary);
    }

    public static double CalculateTax(Manager m) {
        double grossSalary = m.calculateGrossSalary();
        return calculateNetSalary(grossSalary);
    }

    public static double CalculateTax(Trainer t) {
        double grossSalary = t.calculateGrossSalary();
        return calculateNetSalary(grossSalary);
    }

    public static double CalculateTax(Sourcing s) {
        double grossSalary = s.calculateGrossSalary();
        return calculateNetSalary(grossSalary);
    }

    private static double calculateNetSalary(double grossSalary) {
        if (grossSalary > 50000) {
            return grossSalary - grossSalary * 0.20;
        } else {
            return grossSalary - grossSalary * 0.05;
        }
    }
}
