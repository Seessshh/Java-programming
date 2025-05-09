package com.sushil.Constructor;

public class BlcCricket {
    String name;
    int runs;
    int matches;
    float batting_avg;

    BlcCricket(String name, int runs, int matches) {
        this.name = name;
        if (runs < 0)
            System.out.println("Runs Cant be less than 0");
        else
            this.runs = runs;
        if (matches < 0)
            System.out.println("Matches cant be less than 0");
        else
            this.matches = matches;

    }

    public void computeBattingAverage() {
        batting_avg = (runs / matches);
    }

    public void Display() {
        System.out.println("Name of the Cricketer is :" + name);
        System.out.println("Totol runs scored are : " + runs);
        System.out.println("Total matches played : " + matches);
        System.out.println("Batting Average of the batter is : " + batting_avg);
    }
}
