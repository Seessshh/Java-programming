package com.sushil.HasA_Relation;

public class Manager {

    private int managerId;
    private String managerName;
    private double basicSalary;
    private double hraPer;
    private double daPer;
    private double projectAllowance;

    public Manager(int managerId, String managerName, double basicSalary, double hraPer, double daPer, double projectAllowance)
    {
        this.managerId = managerId;
        this.managerName = managerName;
        this.basicSalary = basicSalary;
        this.hraPer = hraPer;
        this.daPer = daPer;
        this.projectAllowance = projectAllowance;
    }

    public double calculateGrossSalary()
    {
        double gSalary = basicSalary+hraPer+daPer+projectAllowance;

        return gSalary;
    }
}
