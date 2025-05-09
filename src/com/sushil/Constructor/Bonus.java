package com.sushil.Constructor;

public class Bonus {

    private double bonusAmount;

    public double getBonusAmount()
    {
        return this.bonusAmount;
    }

    public static Bonus  calculateBonus(EmployeeBonus employeeBonus)
    {
        Bonus b= new Bonus();
        //double bonus = 0;
        int performance = employeeBonus.getPerformanceRating();

        if(performance ==1)
            b.bonusAmount = 5;
        else if (performance==2)
            b.bonusAmount=10;
        else if (performance==3)
            b.bonusAmount=15;
        else if (performance == 4)
            b.bonusAmount=20;
        else if (performance == 5)
            b.bonusAmount=25;

        return b;
    }
}
