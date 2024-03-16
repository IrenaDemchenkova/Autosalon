package Cars;

import java.util.Arrays;
import java.util.Optional;

public enum CarsColours {
    BLACK("Black", 0),
    WHITE("White", 1),
    RED("Red", 2),
    BLUE("Blue", 3),
    GREEN("Green", 4);

    private final String colour;
    private final int colourNumber;

    public static Optional<CarsColours> getColourById(int id) {
        return Arrays.stream(CarsColours.values())
                .filter(colour -> colour.colourNumber == id)
                .findFirst();
    }

    CarsColours(String colour, int colourNumber) {
        this.colour = colour;
        this.colourNumber = colourNumber;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "CarsColours{" +
                "colour='" + colour + '\'' +
                ", colourNumber=" + colourNumber +
                '}';
    }
}
