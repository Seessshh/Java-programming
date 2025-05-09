package com.lab.array_list.Stream_API;

import java.util.Arrays;

public class StreamDemo2
{
    public static void main(String[] args)
    {
        String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};

       Object [] array = Arrays.stream(names).filter(str -> str.contains("a") || str.contains("A")).toArray();
        System.out.println(Arrays.toString(array));

    }
}
