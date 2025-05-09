package com.lab.array_list.Stream_API;

import java.util.Arrays;

public class StreamDemo3
{
    public static void main(String[] args)
    {
        Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        Object [] arr = Arrays.stream(numbers).filter(num -> StreamDemo3.prime(num)).toArray();
        System.out.println(Arrays.toString(arr));
    }

    public static boolean prime(Integer num)
    {
        if (num < 2)
        {
            return false;
        }

        for (int i = 2 ; i<=num/2 ; i++)
        {
            if (num%i == 0)
            {
                return false;
            }
        }

        return true;

    }
}
