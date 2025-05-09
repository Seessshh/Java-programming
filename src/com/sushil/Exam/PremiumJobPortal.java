package com.sushil.Exam;

public class PremiumJobPortal extends JobPortal {
    public PremiumJobPortal(String portalName) {
        super(portalName, true, 2000);
    }

    @Override
    public int calculateEarnings(int... users) {
        return super.calculateEarnings(users);
    }

    @Override
    public PremiumJobPortal getPortalDetails() {
        return this;
    }

    @Override
    public String toString() {
        return "PremiumJobPortal{" +
                "isPremium=" + isPremium +
                ", subscriptionFee=" + subscriptionFee +
                "} " + super.toString();
    }
}
