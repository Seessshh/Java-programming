package com.sushil.Stream_Api;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class StringArrayToStream
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of the array : ");
        int size = sc.nextInt();

        String [] str = new String[size];

        for (int i = 0; i < str.length ; i++)
        {
            System.out.print("Enter the value of "+i+" element of array : ");
            str[i] = sc.next();
        }

        Stream<String> stream =Arrays.stream(str);

        stream.forEach(System.out::println);
    }
}
