package com.sushil.HasA_Relation;

public class Sourcing {

    private int sourceId;
    private String sourceName;
    private double basicSalary;
    private double hraPer;
    private double daPer;
    private int enrollmentTarget;
    private int enrollmentReached;
    private double perkPerEnrollment;

    public Sourcing(int sourceId, String sourceName, double basicSalary, double hraPer, double daPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment)
    {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.basicSalary = basicSalary;
        this.hraPer = hraPer;
        this.daPer = daPer;
        this.enrollmentTarget = enrollmentTarget;
        this.enrollmentReached = enrollmentReached;
        this.perkPerEnrollment = perkPerEnrollment;
    }

    public double calculateGrossSalary()
    {
        double gSalary = basicSalary+hraPer+daPer+(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);

        return gSalary;
    }
}
