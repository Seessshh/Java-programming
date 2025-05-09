package com.sushil.Exam_11_01;

import java.util.Scanner;


import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PrimePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit :");
        int lowerLimit = sc.nextInt();
        System.out.print("Enter the upper limit : ");
        int upperLimit = sc.nextInt();


        Predicate<Integer> isPrime = num -> {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };


        UnaryOperator<Integer> reverseDigits = num -> {
            int reversed = 0;
            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            return reversed;
        };


        Predicate<Integer> isPalindrome = num -> num == reverseDigits.apply(num);


        BiConsumer<String, Integer> displayPrimePalindrome = (prefix, num) -> {
            System.out.println(prefix + num);
        };

        System.out.println("Prime Palindromes between " + lowerLimit + " and " + upperLimit + ":");

        for (int i = lowerLimit; i < upperLimit; i++)
        {
            if (isPrime.test(i) && isPalindrome.test(i))
            {
                displayPrimePalindrome.accept("Prime Palindrome: ", i);
            }
        }
    }
}
