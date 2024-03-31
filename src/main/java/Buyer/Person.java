package Buyer;

import Cars.Car;
import Cars.CarsColours;
import Cars.Models;

import java.util.Optional;
import java.util.Random;

public class Person {
    private static final int BOUND = 5;
    private static final Random RANDOM = new Random();

    private final BuyerName name;
    private final BuyerSurname surname;


    public Person(BuyerName name, BuyerSurname surname) {
        this.name = name;
        this.surname = surname;
    }

    public static Person createBuyer() {
        int buyerName = RANDOM.nextInt(BOUND - 1);
        int buyerSurname = RANDOM.nextInt(BOUND - 1);

        Optional<BuyerName> name = BuyerName.getNameById(buyerName);
        Optional<BuyerSurname> surname = BuyerSurname.getSurnameById(buyerName);

        if (name.isEmpty() || surname.isEmpty()) return null;
        return new Person(name.get(), surname.get());
    }

    public BuyerName getName() {
        return name;
    }

    public BuyerSurname getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return this.getName() + " " +  this.getSurname();
    }
}
