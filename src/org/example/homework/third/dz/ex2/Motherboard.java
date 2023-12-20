package org.example.homework.third.dz.ex2;

public abstract class Motherboard {

    protected String name;
    protected int height;
    protected int length;
    protected int width;

    @Override
    public String toString() {
        return "Motherboard{"
                + "name='"
                + name + '\''
                + "size: "
                + ", height=" + height
                + ", length=" + length
                + ", width=" + width
                + '}';
    }
}
