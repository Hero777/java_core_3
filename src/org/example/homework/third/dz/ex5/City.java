package org.example.homework.third.dz.ex5;

import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Город ").append(getName()).append(":").append(System.lineSeparator());
        for (House house : houses) {
            sb.append(house.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
