package com.lab.array_list.Stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamDemo4
{
    public static void main(String[] args)
    {
        String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};

        List array = Arrays.stream(words).filter(str -> str.length()>3).toList();
        System.out.println(array);
    }
}
