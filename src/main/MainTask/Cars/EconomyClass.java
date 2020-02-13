package Cars;

public class EconomyClass extends CarsParameters {

    private String model;

    public EconomyClass(String model, int maxSpeed, int fuelConsumption, int maximumDrivingDistance, int carCost, int passengerCapacity) {
        super(model, maxSpeed, fuelConsumption, maximumDrivingDistance, carCost, passengerCapacity);
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString().replace("{", "EconomyClass" +
                "model='" + model + '\'');
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
