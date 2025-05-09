package com.sushil.Exam_28_12;

import java.util.Scanner;

public class DiscountCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter thr membership type : ");
        String member = sc.nextLine();

        MembershipFactory m  = new MembershipFactory(member);
        m.factory(member);
    }
}
