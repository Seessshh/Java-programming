package com.sushil.Exam_28_12;

public class MembershipFactory
{
    String membershipType;

    public MembershipFactory(String membershipType) {
        this.membershipType = membershipType;
    }

    public void factory(String membershipType)
    {
        if (membershipType.equalsIgnoreCase("gold"))
        {
            GoldMember g = new GoldMember();
            g.getDiscount();
        }
        else if (membershipType.equalsIgnoreCase("silver"))
        {
            SilverMember s = new SilverMember();
            s.getDiscount();
        }
        else if (membershipType.equalsIgnoreCase("none"))
        {
            NonMember n = new NonMember();
            n.getDiscount();
        }
        else
            System.out.println("Invalid Input");
    }
}
