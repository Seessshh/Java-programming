package com.sushil.Abstraction;

import java.util.Scanner;

public class CakeMain {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape of the cake : ");
        String shape = sc.nextLine();

        System.out.println("Enter the Flavour of the cake : ");
        String flavour = sc.nextLine();

        System.out.println("Enter the cake size in kg : ");
        int qty = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the message if you want to print : ");
        String message = sc.nextLine();

        OrderedCake o = new OrderedCake(shape,flavour,qty,message);
        o.showCake();


    }
}
