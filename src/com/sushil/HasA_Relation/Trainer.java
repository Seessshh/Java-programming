package com.sushil.HasA_Relation;

public class Trainer {

    private int trainerId;
    private String trainerName;
    private double basicSalary;
    private double hraPer;
    private double daPer;
    private int batchCount;
    private double perkPerBatch;

    public Trainer(int trainerId, String trainerName, double basicSalary, double hraPer, double daPer, int batchCount, double perkPerBatch)
    {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.basicSalary = basicSalary;
        this.hraPer = hraPer;
        this.daPer = daPer;
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }

    public double calculateGrossSalary()
    {
        double gSalary = basicSalary+hraPer+daPer+(batchCount*perkPerBatch);

        return gSalary;
    }
}
