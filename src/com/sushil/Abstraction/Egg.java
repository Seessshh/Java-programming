package com.sushil.Abstraction;

public class Egg extends Food
{
    int tastyScore = 7;
    String type = "Non-vegetarian";

    public Egg(double proteins,double fats,double carbs)
    {
        super(proteins,fats,carbs);
    }

    @Override
    void getMacroNutrients()
    {
        System.out.println("An egg has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
    }

    public String getType()
    {
        return type;
    }

    public int getTastyScore()
    {
        return tastyScore;
    }
}
