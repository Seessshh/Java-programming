package com.sushil.functionalInterface;

import java.util.function.Consumer;

public class ObjectCreatorMain {

    public static void main(String[] args) {

       ObjectCreator obj = (id,name) -> new Student(id,name);
       Student s =(Student) obj.create(1,"Sushil");

        System.out.println(s);

        Consumer<String> con = (str) -> s.setName(str);
        s.updateName(con,"Sagar");
        System.out.println(s+" Updated");

    }
}
