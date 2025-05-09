package com.sushil.Logical;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int i=0;

        while(num!=0)
        {

            num = num/10;
            i++;
        }
        System.out.println(i);

    }
}
