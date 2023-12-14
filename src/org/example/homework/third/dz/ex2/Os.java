package org.example.homework.third.dz.ex2;

public abstract class Os {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Os{"
                + "name='"
                + name + '\''
                + '}';
    }
}
