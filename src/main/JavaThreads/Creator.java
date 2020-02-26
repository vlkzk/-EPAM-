public class Creator {
    public static CarPark createParkFirst() {
        CarPark park = new CarPark(0, 5);

        park.addToParkLots(new ParkLot(1, park.getParkId()));
        park.addToParkLots(new ParkLot(2, park.getParkId()));
        park.addToParkLots(new ParkLot(3, park.getParkId()));
        park.addToParkLots(new ParkLot(4, park.getParkId()));
        park.addToParkLots(new ParkLot(5, park.getParkId()));

        return park;
    }

    public static CarPark createParkSecond() {
        CarPark park = new CarPark(1, 6);

        park.addToParkLots(new ParkLot(1, park.getParkId()));
        park.addToParkLots(new ParkLot(2, park.getParkId()));
        park.addToParkLots(new ParkLot(3, park.getParkId()));
        park.addToParkLots(new ParkLot(4, park.getParkId()));
        park.addToParkLots(new ParkLot(5, park.getParkId()));
        park.addToParkLots(new ParkLot(6, park.getParkId()));

        return park;
    }

    public static CarPark createParkThird() {
        CarPark park = new CarPark(2, 7);

        park.addToParkLots(new ParkLot(1, park.getParkId()));
        park.addToParkLots(new ParkLot(2, park.getParkId()));
        park.addToParkLots(new ParkLot(3, park.getParkId()));
        park.addToParkLots(new ParkLot(4, park.getParkId()));
        park.addToParkLots(new ParkLot(5, park.getParkId()));
        park.addToParkLots(new ParkLot(6, park.getParkId()));
        park.addToParkLots(new ParkLot(7, park.getParkId()));

        return park;
    }
}
