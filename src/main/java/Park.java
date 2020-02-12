import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import Cars.CarsParameters;
import Cars.BusinessClass;
import Cars.EconomyClass;
import Cars.LuxuryClass;

public class Park {
    private List<? extends CarsParameters> carsParameters;

    public List<BusinessClass> getBussinessClassCars() {
        List<BusinessClass> businessClass = new ArrayList<>();
        for (CarsParameters car : carsParameters) {
            if (car instanceof BusinessClass) {
                businessClass.add((BusinessClass) car);
            }
        }
        return businessClass;
    }

    public List<EconomyClass> getEconomyClassCars() {
        List<EconomyClass> economyClass = new ArrayList<>();
        for (CarsParameters car : carsParameters) {
            if (car instanceof EconomyClass) {
                economyClass.add((EconomyClass) car);
            }
        }
        return economyClass;
    }

    public List<LuxuryClass> getLuxuryClassCars() {
        List<LuxuryClass> luxuryClass = new ArrayList<>();
        for (CarsParameters car : carsParameters) {
            if (car instanceof LuxuryClass) {
                luxuryClass.add((LuxuryClass) car);
            }
        }
        return luxuryClass;
    }

    public List<CarsParameters> getCostAllCars() {
        List<CarsParameters> cars = new ArrayList<>(getCars());
        System.out.println(cars);
       return cars;
    }

    public Park sortByMaxSpeed() {
        carsParameters.sort(new Comparator<CarsParameters>() {
            @Override
            public int compare(CarsParameters o1, CarsParameters o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });
        return this;
    }

    public Park sortByMaxFuelConsumption() {
        carsParameters.sort(new Comparator<CarsParameters>() {
            @Override
            public int compare(CarsParameters o1, CarsParameters o2) {
                return o1.getFuelConsumption() - o2.getFuelConsumption();
            }
        });
        return this;
    }

    public Park sortByMaxDrivingDistance() {
        carsParameters.sort(new Comparator<CarsParameters>() {
            @Override
            public int compare(CarsParameters o1, CarsParameters o2) {
                return o1.getMaximumDrivingDistance() - o2.getMaximumDrivingDistance();
            }
        });
        return this;
    }

    public void sortByMaxCarCost() {
        carsParameters.sort(new Comparator<CarsParameters>() {
            @Override
            public int compare(CarsParameters o1, CarsParameters o2) {
                return o1.getCarCost() - o2.getCarCost();
            }
        });
    }

    public Park sortByMaxPassengerCapasity() {
        carsParameters.sort(new Comparator<CarsParameters>() {
            @Override
            public int compare(CarsParameters o1, CarsParameters o2) {
                return o1.getPassengerCapacity() - o2.getPassengerCapacity();
            }
        });
        return this;
    }

    public List<? extends CarsParameters> getCars() {return carsParameters;}

    public Park(List<? extends CarsParameters> carsParameters) {
        this.carsParameters = carsParameters;
    }

    @Override
    public String toString() {
        return "Park" + " " +
                "cars=" + carsParameters.toString();

    }
}
