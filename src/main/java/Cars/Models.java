package Cars;

import java.util.Arrays;
import java.util.Optional;

public enum Models {
    LEXUS("Lexus", 0),
    TOYOTA("Toyota", 1),
    INFINITY("Infinity", 2),
    PORSCHE("Porsche", 3),
    BMW("BMW", 4);

    public static Optional<Models> getModelById(int id) {
        return Arrays.stream(Models.values())
                .filter(model -> model.modelNum == id)
                .findFirst();
    }

    private final String modelName;
    private final int modelNum;

    Models(String modelName, int modelNum) {
        this.modelName = modelName;
        this.modelNum = modelNum;
    }

    public String getModelName() {
        return this.modelName;
    }

    @Override
    public String toString() {
        return "Models{" +
                "modelName='" + modelName + '\'' +
                ", modelNum=" + modelNum +
                '}';
    }
}

