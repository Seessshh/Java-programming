package com.sushil.Constructor;

public class Inventory {

    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;

    public Inventory(String itemName, double pricePerUnit, int quantityInStock) {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantityInStock = quantityInStock;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double calculateTotalValue()
    {
        return pricePerUnit*quantityInStock;
    }
}
