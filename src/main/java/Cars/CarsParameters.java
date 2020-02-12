package Cars;

import java.util.Objects;

abstract public class CarsParameters {
    String model;
    private int maxSpeed;
    private int fuelConsumption;
    private int maximumDrivingDistance;
    private int carCost;
    private int passangerCapacity;

    public CarsParameters(String model, int maxSpeed, int fuelConsumption, int maximumDrivingDistance, int carCost, int passangerCapacity) {
        this.carCost = carCost;
        this.fuelConsumption = fuelConsumption;
        this.maximumDrivingDistance = maximumDrivingDistance;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.passangerCapacity = passangerCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaximumDrivingDistance() {
        return maximumDrivingDistance;
    }

    public int getCarCost() {
        return carCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarsParameters that = (CarsParameters) o;
        return maxSpeed == that.maxSpeed &&
                fuelConsumption == that.fuelConsumption &&
                maximumDrivingDistance == that.maximumDrivingDistance &&
                carCost == that.carCost &&
                passangerCapacity == that.passangerCapacity &&
                Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, fuelConsumption, maximumDrivingDistance, carCost, passangerCapacity);
    }

    @Override
    public String toString() {
        return "CarsParameters{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                ", maximumDrivingDistance=" + maximumDrivingDistance +
                ", carCost=" + carCost +
                ", passangerCapacity=" + passangerCapacity +
                '}';
    }
}