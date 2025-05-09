package com.sushil.Exam;

public class JobPortalSimulator {
    public static void main(String[] args) {
        JobPortal generalPortal = new JobPortal("General Jobs", false, 500);
        PremiumJobPortal premiumPortal = new PremiumJobPortal("Premium Jobs");
        FreelanceJobPortal freelancePortal = new FreelanceJobPortal("Freelance Jobs");

        RevenueAnalyzer analyzer = new RevenueAnalyzer();

        analyzer.analyze(generalPortal, 10, 5, 8);
        analyzer.analyze(premiumPortal, 5, 3, 2);
        analyzer.analyze(freelancePortal, 15, 10, 7);


    }
}
