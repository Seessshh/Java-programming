package com.sushil.Abstraction;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of food items : ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1 ; i<=n ; i++)
        {
            System.out.println("Enter the food name : ");
            String foodName = sc.nextLine();

            if (foodName.equalsIgnoreCase("Egg"))
            {
                Egg e = new Egg(7,2,4.2);
                System.out.println("Egg is "+e.getType());
                e.getMacroNutrients();
                System.out.println(e.getTastyScore());
            }
            else if (foodName.equalsIgnoreCase("Bread"))
            {
                Bread b = new Bread(4,1.1,13.8);

                System.out.println("Bread is "+b.getType());
                b.getMacroNutrients();
                System.out.println("Taste : "+b.getTastyScore());
            }
            else {
                System.err.println("Invalid food name.");
            }
        }
    }
}
