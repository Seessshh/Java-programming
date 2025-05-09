package com.sushil.HasA_Relation;

public class Person {

    private String name;
    private final Address address;

    public Person(String name) {
        this.name = name;
        this.address = new Address("123 Flm Street","Spring field");
    }

    @Override
    public String toString() {
        return "{" +
                "name=" + name +
                ", " + address +
                '}';
    }
}
