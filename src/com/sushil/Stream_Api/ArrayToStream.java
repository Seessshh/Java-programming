package com.sushil.Stream_Api;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class ArrayToStream
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        Integer [] arr = new Integer[size];

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.println("Enter the value of "+i+" element of array : ");
            arr[i] = sc.nextInt();
        }
         Stream<Integer> stream = Arrays.stream(arr);

        stream.forEach(n -> System.out.print(n+ "\t"));


    }
}
