package com.sushil.Abstraction;

public class Bread extends Food
{
    int tastyScore = 8;
    String type = "Vegetarian";

    public Bread(double proteins, double fats, double carbs)
    {
        super(proteins, fats, carbs);
    }

    @Override
    void getMacroNutrients()
    {
        System.out.println("A slice of bread has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
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
