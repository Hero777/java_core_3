package org.example.homework.third.mydz.ex2;

public class SamsungPhone extends Phone {

    public SamsungPhone() {
        this.type = "Samsung";
    }

    @Override
    public String toString() {
        return "SamsungPhone{"
                + "type='" + type + '\''
                + ", os=" + os
                + ", motherboard=" + motherboard
                + ", camera=" + camera
                + '}';
    }
}
