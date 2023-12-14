package org.example.homework.third.dz.ex2;

public class IphoneCamera extends Camera {
    private boolean flash;

    public IphoneCamera() {
        this.zoom = "15x";
        flash = true;
    }

    @Override
    public String toString() {
        return "IphoneCamera{"
                + "flash=" + flash
                + ", zoom='"
                + zoom + '\'' + '}';
    }
}
