package com.sushil.Polymorphism;

public class MathOperations {

    public int add(int num1,int num2)
    {
        int res = num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" (int) : "+res);
        return res;
    }
    public double add(double num1,double num2)
    {
        double res = num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" (double) : "+res);
        return res;
    }
    public int multiply(int num1,int num2)
    {
        int res = num1*num2;
        System.out.println("Sum of "+num1+" and "+num2+" (int) : "+res);
        return res;
    }
    public double multiply(double num1,double num2)
    {
        double res = num1*num2;
        System.out.println("Sum of "+num1+" and "+num2+" (double) : "+res);
        return res;
    }
}
