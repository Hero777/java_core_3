package org.example.homework.four.mydz.ex2;

import org.example.homework.four.mydz.ex2.exceptions.FlyException;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка: утка ранена");
        } else {
            System.out.println("утка летит");
        }
    }
}
