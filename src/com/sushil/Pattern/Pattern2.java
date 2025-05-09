package com.sushil.Pattern;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the pattern size : ");
        int num = sc.nextInt();

        for (int i=1;i<=num;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if (j==i || j==1 || i==num)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println("");
        }
    }
}
