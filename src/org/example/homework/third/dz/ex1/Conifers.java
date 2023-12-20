package org.example.homework.third.dz.ex1;

//хвойные
public abstract class Conifers extends Tree {
    private String needleType;

    public Conifers(int age, String needleType) {
        super(age);
        this.needleType = needleType;
    }

    public String getNeedleType() {
        return needleType;
    }
}
