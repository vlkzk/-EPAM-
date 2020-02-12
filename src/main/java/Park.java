import java.util.ArrayList;
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
}
