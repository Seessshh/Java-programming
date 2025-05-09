package com.sushil.Constructor;

import java.util.Scanner;

public class CricketTester {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int i;

        for (i=1;i<=4;i++) {
            System.out.println("Enter your name");
            String name = sc.nextLine();
            System.out.println("Enter the total runs ");
            int runs = sc.nextInt();
            System.out.println("Enter the total matches");
            int matches = sc.nextInt();
            BlcCricket b1 = new BlcCricket(name, runs, matches);
            b1.computeBattingAverage();
            b1.Display();
        }
    }
}
