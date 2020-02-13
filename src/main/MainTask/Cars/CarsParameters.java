package Cars;

import java.util.Objects;

abstract public class CarsParameters {
    String model;
    private int maxSpeed;
    private int fuelConsumption;
    private int maximumDrivingDistance;
    private int carCost;
    private int passengerCapacity;

    public CarsParameters(String model, int maxSpeed, int fuelConsumption, int maxDrivingDistance, int carCost, int passengerCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.maximumDrivingDistance = maxDrivingDistance;
        this.carCost = carCost;
        this.passengerCapacity = passengerCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getCarCost() {
        return carCost;
    }

    @Override
    public String toString() {
        return "model = '" + model + '\'' +
                ", maxSpeed = " + maxSpeed +
                ", fuelConsumption = " + fuelConsumption +
                ", maximumDrivingDistance = " + maximumDrivingDistance +
                ", carCost = " + carCost +
                ", passengerCapacity = " + passengerCapacity;
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
                passengerCapacity == that.passengerCapacity &&
                Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, fuelConsumption, maximumDrivingDistance, carCost, passengerCapacity);
    }
}