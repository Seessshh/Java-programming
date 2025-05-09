package com.lab.array_list.Stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1
{
    public static  void main(String[] args)
    {

        Integer [] numbers = {-10,-5,0,5,10,-20};

        Object [] objects = Arrays.stream(numbers).map(num -> num < 0 ? 0 : num).toArray();
        System.out.println(Arrays.toString(objects));

    }
}
