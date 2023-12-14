package org.example.homework.third.dz.ex2;

public abstract class Phone {
    protected String type;
    protected Os os;
    protected Motherboard motherboard;
    protected Camera camera;

    protected void addMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    protected void addCamera(Camera camera) {
        this.camera = camera;
    }

    protected void addOs(Os os) {
        this.os = os;
    }

    public String getType() {
        return type;
    }
}
