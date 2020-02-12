package Cars;

import java.util.Objects;

public class LuxuryClass extends CarsParameters {
    public LuxuryClass(String model, int maxSpeed, int fuelConsumption, int maximumDrivingDistance, int carCost, int passangerCapacity) {
        super(model, maxSpeed, fuelConsumption, maximumDrivingDistance, carCost, passangerCapacity);
    }

    @Override
    public String toString() {
        return "LuxuryClass{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LuxuryClass)) return false;
        if (!super.equals(o)) return false;
        LuxuryClass that = (LuxuryClass) o;
        return model == that.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }
}
