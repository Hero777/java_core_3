package org.example.homework.third.mydz.ex1;

public class Birch extends Deciduous {
    public Birch(int age) {
        super(age, true);
    }

    public void releasesAllergen() {
        System.out.println("она источает аллергены");
    }
}
