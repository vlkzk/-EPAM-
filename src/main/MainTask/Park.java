import java.util.*;

import Cars.*;

public class Park {
    private List<? extends CarsParameters> carsParameters;

    public Park sortByMaxFuelConsumption() {
        carsParameters.sort((Comparator<CarsParameters>) (o1, o2) -> o2.getFuelConsumption() - o1.getFuelConsumption());
        return this;
    }

    public List<? extends CarsParameters> getCars() {
        return carsParameters;
    }

    @Override
    public String toString() {
        return "Park" + " " +
                "cars=" + carsParameters.toString();
    }

    public Park(List<? extends CarsParameters> carsParameters) {
        this.carsParameters = carsParameters;
    }
}
