package com.sushil.exam_25_01;

import java.util.Scanner;

public class BankingDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the withdraw amount : ");
            String  amount = sc.next();
            double cash = Double.parseDouble(amount);
            System.out.println("You entered withdrawal amount: "+amount);

        }
        catch (Exception e)
        {
            System.err.println("Input is invalid.");

        }

    }
}
