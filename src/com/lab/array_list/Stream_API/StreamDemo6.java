package com.lab.array_list.Stream_API;

import java.util.Arrays;

public class StreamDemo6
{
    public static void main(String[] args) {

        String[] words = {"madam", "hello", "racecar", "java", "level", "world"};

        Object[] s=  Arrays.stream(words).filter(str -> StreamDemo6.palindrome(str)).toArray();

        System.out.println("Palindrome words : "+Arrays.toString(s));

    }

    private static  boolean palindrome(String str)
    {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
}
