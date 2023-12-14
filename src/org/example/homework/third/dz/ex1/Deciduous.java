package org.example.homework.third.dz.ex1;

//лиственные
public abstract class Deciduous extends Tree {
    private boolean isFoliage;

    public Deciduous(int age, boolean isFoliage) {
        super(age);
        this.isFoliage = isFoliage;
    }

    public void foliageFall() {
        System.out.println("листья пропадают с дерева");
    }

    public void foliageGrow() {
        System.out.println("листья появляются");
    }
}
