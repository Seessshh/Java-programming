package com.sushil.Abstraction;

public abstract class Cake
{
    private String shape;
    private String flavour;
    private int qty;
    private float price;

    protected Cake(String shape, String flavour, int qty) {
        this.shape = shape;
        this.flavour = flavour;
        this.qty = qty;
        this.price = qty*400;
    }

    protected String getShape() {
        return shape;
    }

    protected void setShape(String shape) {
        this.shape = shape;
    }

    protected String getFlavour() {
        return flavour;
    }

    protected void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    protected int getQty() {
        return qty;
    }

    protected void setQty(int qty) {
        this.qty = qty;
    }

    protected float getPrice() {
        return price;
    }

    protected void setPrice(float price) {
        this.price = price;
    }

    protected void showCake()
    {
        System.out.println("A "+this.shape+" "+this.flavour+" Cake of "+this.qty+" Kg/Kg's ready with   @ Rs."+this.price+"/-");
    }



}
