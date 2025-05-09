package com.sushil.Logical;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int i = 0;
        while (temp!=0)
        {
            temp = temp/10;
            i++;
        }

        temp = num;

        int check=0;
        while (temp !=0)
        {
            int rem=1;
            for (int j =0;j<i;j++)
            {
                rem =rem* (temp%10);

            }
            check += rem;
            temp = temp/10;
        }
        if (num == check)
            System.out.println("Armstromg number");
        else
            System.out.println("Not Armstrong number");
    }
}
