package com.lab.array_list.Stream_API;

import java.util.Arrays;

public class StreamDemo7
{
    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50};

        Object[] obj = Arrays.stream(numbers).map(num -> "Number: "+num).toArray();

        System.out.println("Converted Strings : "+Arrays.toString(obj));
    }
}
