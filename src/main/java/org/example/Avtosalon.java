package org.example;

import Cars.Car;

import java.util.ArrayList;
import java.util.List;

public class Avtosalon {
    private final List<Car> cars = new ArrayList<>();

    public synchronized int count() {
        return this.cars.size();
    }

    public synchronized void get() {
        while (this.cars.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        Car car = this.cars.remove(0);
        System.out.println("-1 : Автомобиль забрали");
        System.out.println(car);
        System.out.println(
                "\tколичество автомобилей на складе : " + this.cars.size());
        notify();
    }

    public synchronized void put() {
        while (this.cars.size() >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        Car car = Car.createCar();
        this.cars.add(car);
        System.out.println("+1 : товар добавили");
        System.out.println(car);
        System.out.println(
                "\tколичество товара на складе : " + this.cars.size());
        notify();
    }
}

