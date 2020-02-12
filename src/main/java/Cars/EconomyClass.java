package Cars;

import java.util.Objects;

public class EconomyClass extends CarsParameters {
    public EconomyClass(String model, int maxSpeed, int fuelConsumption, int maximumDrivingDistance, int carCost, int passangerCapacity) {
        super(model, maxSpeed, fuelConsumption, maximumDrivingDistance, carCost, passangerCapacity);
    }

    @Override
    public String toString() {
        return "EconomyClass{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EconomyClass)) return false;
        if (!super.equals(o)) return false;
        EconomyClass that = (EconomyClass) o;
        return model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }
}
