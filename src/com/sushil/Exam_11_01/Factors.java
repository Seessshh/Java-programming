package com.sushil.Exam_11_01;

import java.util.Scanner;
import java.util.function.Consumer;

public class Factors
{

    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        Consumer<Integer> f = factor -> {
            if (number % factor == 0) {
                System.out.print(factor + " ");
            }
        };


        for (int i = 1; i <= number; i++) {
            f.accept(i);
        }
    }
}

