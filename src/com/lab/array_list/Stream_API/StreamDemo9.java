package com.lab.array_list.Stream_API;

import java.util.Arrays;

public class StreamDemo9
{
    public static void main(String[] args) {

        Boolean[] flags = {true, false, true, false, true};

        Arrays.stream(flags).map(bool -> bool ? "yes" : "no").forEach(System.out::println);
    }
}
