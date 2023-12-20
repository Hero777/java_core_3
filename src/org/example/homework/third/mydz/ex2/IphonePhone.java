package org.example.homework.third.mydz.ex2;

public class IphonePhone extends Phone {


    public IphonePhone() {
        this.type = "Iphone15";
    }

    @Override
    public String toString() {
        return "IphonePhone{"
                + "type='" + type + '\''
                + ", os=" + os
                + ", motherboard=" + motherboard
                + ", camera=" + camera
                + '}';
    }
}
