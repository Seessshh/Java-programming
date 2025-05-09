package com.sushil.Constructor;

public class ShippingFee {
    private double feeAmount;

    public double getFeeAmount() {
        return feeAmount;
    }

    public static ShippingFee calculateFee(Shiping s)
    {
        ShippingFee s1 = new ShippingFee();

        double weight=s.getPackageWeight();
        int dis=s.getShippingDistance();

        if(weight <= 5)
        {
            if (dis <=100)
                s1.feeAmount=5;
            else if (dis > 100)
                s1.feeAmount=10;
        }
        else if (weight >5 && weight <=20)
        {
            if (dis <=100)
                s1.feeAmount = 10;
            else
                s1.feeAmount = 20;
        }
        else
        {
            if (dis <= 100)
                s1.feeAmount = 20;
            else
                s1.feeAmount = 40;
        }

        return s1;
    }
}
