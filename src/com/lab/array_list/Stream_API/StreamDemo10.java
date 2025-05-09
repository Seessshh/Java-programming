package com.lab.array_list.Stream_API;

import java.util.Arrays;

public class StreamDemo10
{
    public static void main(String[] args) {

        String []names = {"James", "Aryan", "Vibha", "Aniket"};

        Arrays.stream(names).map(str -> str.charAt(0)).forEach(System.out::print);
    }
}
