package com.sushil.Stream_Api;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class LongArrrayToStream
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        Long [] arr = new Long[size];

        for (int i = 0 ; i<arr.length ; i++)
        {
            System.out.println("Enter the value of "+i+" element of array : ");
            arr[i] = sc.nextLong();
        }

        Stream<Long> stream =Arrays.stream(arr);

        stream.forEach( System.out::println);
    }
}
