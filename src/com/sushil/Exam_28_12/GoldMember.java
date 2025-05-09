package com.sushil.Exam_28_12;

public class GoldMember implements Membership
{

    @Override
    public void getDiscount() {
        System.out.println("You are entitled to a 20% discount.");
    }
}
