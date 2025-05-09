package com.sushil.Constructor;

public class Task {
    private String title;
    private String description;
    private String priority;
    private boolean isTaskCompleted;
    public Task(String title, String description, String priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }
    public void updateDescription(String newDes)
    {
        description=newDes;
    }
    public void updatePriority(String newPrio)
    {
        priority = newPrio;
    }
    public boolean  markAsCompleted()
    {
       return  isTaskCompleted=true;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }
    public boolean isCompleted()
    {
        return isTaskCompleted;
    }
}
