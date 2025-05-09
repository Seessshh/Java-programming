package com.sushil.Exam;

public class JobPortal {
    private String portalName;
    protected boolean isPremium;
    protected int subscriptionFee;

    public JobPortal(String portalName, boolean isPremium, int subscriptionFee) {
        this.portalName = portalName;
        this.isPremium = isPremium;
        this.subscriptionFee = subscriptionFee;
    }

    public int calculateEarnings(int... users) {
        int totalEarnings = 0;
        for (int user : users) {
            totalEarnings += subscriptionFee;
        }
        return totalEarnings;
    }

    public JobPortal getPortalDetails() {
        return this;
    }
}





