package com.sushil.Inheritance;

public class Mammal extends Animal{

    private boolean hasFur;

    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return super.toString()+"Mammal{" +
                "hasFur=" + hasFur +
                "} " ;
    }


}
