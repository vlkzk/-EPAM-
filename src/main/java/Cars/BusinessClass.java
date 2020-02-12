package Cars;

import java.util.Objects;

public class BusinessClass extends CarsParameters {
    public BusinessClass(String model, int maxSpeed, int fuelConsumption, int maximumDrivingDistance, int carCost, int passangerCapacity) {
        super(model, maxSpeed, fuelConsumption, maximumDrivingDistance, carCost, passangerCapacity);
    }

    @Override
    public String toString() {
        return "BusinessClass{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessClass)) return false;
        if (!super.equals(o)) return false;
        BusinessClass that = (BusinessClass) o;
        return model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }
}
