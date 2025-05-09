package com.sushil.HasA_Relation;

public class Customer {

    private  String name;
    private  String email;
    private final Order order;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.order = new Order("1001","Laptop");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", order=" + order +
                '}';
    }
}
