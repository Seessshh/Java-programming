package com.sushil.Pattern;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for (int r= 1;r<=num;r++)
        {
            for (int c=1;c<=num;c++)
            {
                if (c==num || r==num || r+c==6)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
}
