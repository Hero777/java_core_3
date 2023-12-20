package org.example.homework.third.dz.ex5;

public class House {
    private String street;
    private int numberOfHouse;

    public House(String street, int numberOfHouse) {
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public String toString() {
        return "Наименование улицы: "
                + street + '\''
                + ", Номер дома: "
                + numberOfHouse;
    }
}
