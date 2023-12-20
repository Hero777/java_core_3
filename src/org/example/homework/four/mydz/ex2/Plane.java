package org.example.homework.four.mydz.ex2;

import org.example.homework.four.mydz.ex2.exceptions.FlyException;

public class Plane implements Flyable {
    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (this.countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        } else {
            System.out.println("самолет летит");
        }
    }
}
