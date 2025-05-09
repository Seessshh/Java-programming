package com.sushil.Abstraction;

public class OrderedCake extends Cake
{
    private String message;

    public OrderedCake()
    {
        super("Round","Vanilla",1);
        this.message="";
    }

    public OrderedCake(String shape , String flavour , int qty)
    {
        super(shape, flavour, qty);
        this.message="";

    }



    public OrderedCake(String shape, String flavour, int qty,String message) {
        super(shape, flavour, qty);
        this.message = message;
    }

}
