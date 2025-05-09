package com.sushil.Scenario_based_programs;

public class Payment {

    private double amount;
    private String cardHolderName;
    private String creditCardNumber;
    private String debitCardNumber;

    public Payment(double amount, String cardHolderName, String creditCardNumber, String debitCardNumber) {
        this.amount = amount;
        this.cardHolderName = cardHolderName;
        this.creditCardNumber = creditCardNumber;
        this.debitCardNumber = debitCardNumber;
    }

    public void makePayment(double amount)
    {

    }
    private boolean validateAmount(double amount)
    {
        boolean b = true;
        if (amount<0)
            b= false;

        return b;
    }

    public void makePayment(String cardHolderName,String creditCardNumber,double amount)
    {

    }

    public void makePayment(String debitCardNumber,double amount)
    {

    }
}
