package org.example.homework.four.mydz.ex1;

public class CarWash {
    private int cost = 0;

    public int washCar(Vehicle vehicle) {
        if (vehicle.isClean()) {
            return 0;
        } else {
            vehicle.setClean(true);
            if (vehicle.isLarge()) {
                cost += 4000;
            } else {
                cost += 2000;
            }
            return cost;
        }
    }

    public int getCost() {
        return cost;
    }
}
