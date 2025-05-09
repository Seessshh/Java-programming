package com.sushil.Stream_Api;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class DoubleArrayToStream
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        Double [] arr = new Double[size];

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.println("Enter the value of "+i+" element of array : ");
            arr[i] = sc.nextDouble();
        }

        Stream<Double> stream = Arrays.stream(arr);

        stream.forEach(System.out::println);

    }
}
