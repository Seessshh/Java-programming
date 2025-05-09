package com.lab.array_list.Stream_API;

import java.util.Arrays;
import java.util.Locale;

public class StreamDemo8
{
    public static void main(String[] args) {

        String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};

        Arrays.stream(names).map(str -> str.toUpperCase()).forEach(System.out::println);
    }
}
