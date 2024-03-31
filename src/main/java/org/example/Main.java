package org.example;
import  Buyer.Person;
import Cars.Car;

public class Main {
    public static void main(String[] args) {

        Person person = Person.createBuyer();
        System.out.println(person.toString());
        Car car = Car.createCar();
        System.out.println (car.toString());

//
//        Avtosalon avtosalon = new Avtosalon();
//        Producer producer = new Producer(avtosalon);
//        Buyer buyer = new Buyer(avtosalon);
//        new Thread(producer).start();
//        new Thread(buyer).start();
    }
}