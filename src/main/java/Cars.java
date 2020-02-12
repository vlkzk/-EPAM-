import java.util.Arrays;
import java.util.List;

import Cars.CarsParameters;
import Cars.BusinessClass;
import Cars.LuxuryClass;
import Cars.EconomyClass;

public class Cars {
    static List<CarsParameters> cars = Arrays.asList(
            new BusinessClass("Hyundai Genesis", 250, 16, 350, 26000, 5),
            new BusinessClass("BMW Serie 5", 250, 10, 520, 60000, 5),
            new BusinessClass("Mercedes CLS", 250, 12, 480, 52000, 5),
            new BusinessClass("Skoda Superb", 220, 8, 520, 45000, 5),
            new BusinessClass("Audi A6", 260, 9, 460, 62000, 5),
            new EconomyClass("KIA Rio", 180, 6, 350, 15000, 5),
            new EconomyClass("Hyundai Solaris", 180, 7, 300, 14000, 5),
            new EconomyClass("Lada Granta", 160, 8, 320, 11000, 5),
            new EconomyClass("Daewoo Gentra", 160, 5, 300, 9000, 5),
            new EconomyClass("Chevrolet Aveo", 180, 6, 330, 12500, 5),
            new LuxuryClass("BMW Serie 7", 260, 12, 450, 140_000, 4),
            new LuxuryClass("Mercedes S-klass", 280, 18, 400, 120_000, 5),
            new LuxuryClass("Jaguar XJ", 250, 14, 450, 118_000, 5),
            new LuxuryClass("Volkswagen Phaeton", 260, 18, 400, 158_000, 4),
            new LuxuryClass("Audi A8", 250, 15, 400, 156_000, 4)
    );
}
