package org.example.homework.third.dz.ex2;

public class Factory {
    public void assemblyPhone(SamsungPhone phone) {
        phone.addCamera(new SamsungCamera());
        phone.addMotherboard(new Mbj108());
        phone.addOs(new AndroidOs());
        System.out.println(phone);
    }

    public void assemblyPhone(IphonePhone phone) {
        phone.addCamera(new IphoneCamera());
        phone.addMotherboard(new Mb7uik());
        phone.addOs(new Ios());
        System.out.println(phone);
    }
}
