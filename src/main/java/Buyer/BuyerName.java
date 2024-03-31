package Buyer;

import java.util.Arrays;
import java.util.Optional;

public enum BuyerName {
    Alex("Alex", 0),
    Ivan("Ivan", 1),
    Mike("Mike", 2),
    Iden("Iden", 3),
    Kira("Kira", 4);
    private final String name;
    private final int nameNumber;

    BuyerName(String name, int nameNumber) {
        this.name = name;
        this.nameNumber = nameNumber;
    }
    public static Optional<BuyerName> getNameById(int id) {
        return Arrays.stream(BuyerName.values())
                .filter(name -> name.nameNumber == id)
                .findFirst();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BuyerName " + getName();
    }
}
