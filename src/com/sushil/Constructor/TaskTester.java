package com.sushil.Constructor;

public class TaskTester {
    public static void main (String [] args)
    {
        Task t = new Task("final project","complete documentation","high");
        System.out.println("Task Title : "+t.getTitle());
        System.out.println("Task Description : "+t.getDescription());
        System.out.println("Task priority : "+t.getPriority());
        System.out.println("Is Task Completed : "+t.isCompleted());

    }
}
