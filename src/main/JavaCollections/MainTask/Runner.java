import Cars.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {
    static List<CarsParameters> cars = Arrays.asList(
            new BusinessClass("Hyundai Genesis", 250, 16, 350, 26_000, 5),
            new BusinessClass("BMW Serie 5", 250, 10, 520, 60_000, 5),
            new BusinessClass("Mercedes CLS", 250, 12, 480, 52_000, 5),
            new BusinessClass("Skoda Superb", 220, 8, 520, 45_000, 5),
            new BusinessClass("Audi A6", 260, 9, 460, 62_000, 5),
            new EconomyClass("KIA Rio", 180, 6, 350, 15_000, 5),
            new EconomyClass("Hyundai Solaris", 180, 7, 300, 14_000, 5),
            new EconomyClass("Lada Granta", 160, 8, 320, 11_000, 5),
            new EconomyClass("Daewoo Gentra", 160, 5, 300, 9_000, 5),
            new EconomyClass("Chevrolet Aveo", 180, 6, 330, 12_500, 5),
            new LuxuryClass("BMW Serie 7", 260, 12, 450, 140_000, 4),
            new LuxuryClass("Mercedes S-class", 280, 18, 400, 120_000, 5),
            new LuxuryClass("Jaguar XJ", 250, 14, 450, 118_000, 5),
            new LuxuryClass("Volkswagen Phaeton", 260, 18, 400, 158_000, 4),
            new LuxuryClass("Audi A8", 250, 15, 400, 156_000, 4)
    );

    public static void main(String[] args) {
        Park park = new Park(cars);
        Park car = new Park(park.getCars());
        List<CarsParameters> allCarsInPark = new ArrayList<>(park.getCars());
        System.out.println("Cars sorted by max fuel consumption: " + car
                .sortByMaxFuelConsumption()
                .toString());
        double carCost = 0.0;
        for (CarsParameters carsParameters : allCarsInPark) {
            carCost += carsParameters.getCarCost();
        }
        System.out.println("Cost all cars in park: " + carCost);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper speed limit");
        double maxSpeed = Double.parseDouble(scanner.next());
        System.out.println("Enter a lower speed limit");
        double minSpeed = Double.parseDouble(scanner.next());
        if (minSpeed > maxSpeed) {
            System.out.println("Invalid values");
        }
        for (CarsParameters carsParameters : allCarsInPark) {
            if (carsParameters.getMaxSpeed() >= minSpeed && carsParameters.getMaxSpeed() <= maxSpeed) {
                System.out.println("Cars found for a given range: " + carsParameters);
            }
        }
    }
}