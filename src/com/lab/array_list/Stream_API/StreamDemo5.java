package com.lab.array_list.Stream_API;

import java.util.Arrays;

public class StreamDemo5
{
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};

        Object [] array =  Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(array));
    }
}
