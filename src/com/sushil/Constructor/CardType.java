package com.sushil.Constructor;

public class CardType {
    private String cardName;

    public String getCardName() {
        return cardName;
    }
    public void getCardTypes(double monthlySpending)
    {

        if (monthlySpending <10000)
            cardName= "silver";
        else if (monthlySpending >10000 && monthlySpending <50000)
            cardName= "Gold";
        else if (monthlySpending > 50000)
            cardName= "Platinum";


    }
}
