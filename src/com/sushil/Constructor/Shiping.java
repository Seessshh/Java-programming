package com.sushil.Constructor;

public class Shiping {
    private double packageWeight;
    private int shippingDistance;

    public Shiping(double packageWeight, int shippingDistance) {
        this.packageWeight = packageWeight;
        this.shippingDistance = shippingDistance;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public int getShippingDistance() {
        return shippingDistance;
    }

    public void setShippingDistance(int shippingDistance) {
        this.shippingDistance = shippingDistance;
    }

    @Override
    public String toString() {
        return "Shiping{" +
                "packageWeight=" + packageWeight +
                ", shippingDistance=" + shippingDistance +
                '}';
    }
}
