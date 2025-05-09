package com.sushil.Exam;

public class FreelanceJobPortal extends JobPortal {
    public FreelanceJobPortal(String portalName) {
        super(portalName, false, 1000);
    }

    @Override
    public int calculateEarnings(int... users) {
        return super.calculateEarnings(users);
    }

    @Override
    public FreelanceJobPortal getPortalDetails() {
        return this;
    }
}
