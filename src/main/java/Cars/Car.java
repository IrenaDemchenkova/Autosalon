package Cars;

import java.util.Optional;
import java.util.Random;

public class Car {
    private static final int BOUND = 5;
    private static final Random RANDOM = new Random();

    private final Models model;
    private final CarsColours colour;

    public Car(Models model, CarsColours colour) {
        this.model = model;
        this.colour = colour;
    }

    public static Car createCar() {
        int carModel = RANDOM.nextInt(BOUND - 1);
        int carColour = RANDOM.nextInt(BOUND - 1);

        Optional<CarsColours> colour = CarsColours.getColourById(carColour);
        Optional<Models> model = Models.getModelById(carModel);

        if (colour.isEmpty() || model.isEmpty()) return null;
        return new Car(model.get(), colour.get());
    }

    public Models getModel() {
        return model;
    }

    public CarsColours getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return this.getModel().getModelName() + ", color: " + this.getColour().getColour();
    }
}