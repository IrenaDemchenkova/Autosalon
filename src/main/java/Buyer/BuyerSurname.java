package Buyer;

import java.util.Arrays;
import java.util.Optional;

public enum BuyerSurname {
    Ivanov ("Ivanov", 0),
    Petrov ("Petrov", 1),
    Smith ("Smith", 2),
    Black ("Black", 3),
    White ("White", 4);
    private final String surname;
    private final int surnameNumber;

    BuyerSurname(String surname, int surnameNumber) {
        this.surname = surname;
        this.surnameNumber = surnameNumber;
    }
    public static Optional<BuyerSurname> getSurnameById(int id) {
        return Arrays.stream(BuyerSurname.values())
                .filter(surname -> surname.surnameNumber == id)
                .findFirst();
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "BuyerName " + getSurname();
    }
}


