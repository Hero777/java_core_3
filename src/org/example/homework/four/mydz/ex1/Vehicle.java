package org.example.homework.four.mydz.ex1;

public abstract class Vehicle {
    protected boolean isClean;
    protected Size size;

    public Vehicle(boolean isClean, Size size) {
        this.isClean = isClean;
        this.size = size;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isLarge() {
        return size.getLength() > 6 || size.getHeight() > 2.5 || size.getWidth() > 2;
    }
}
