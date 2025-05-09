package com.sushil.Exam;


public class RevenueAnalyzer {
    public void analyze(JobPortal portal, int... users) {
        if (portal instanceof PremiumJobPortal) {
            System.out.println("Premium Job Portal Earnings:");
        } else if (portal instanceof FreelanceJobPortal) {
            System.out.println("Freelance Job Portal Earnings:");
        } else {
            System.out.println("Job Portal Earnings:");
        }

        int earnings = portal.calculateEarnings(users);
        System.out.println("Total Earnings: " + earnings + " ");
    }
}
