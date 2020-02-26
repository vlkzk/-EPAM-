

public class Parking {
    public static void main(String[] args) {
        ParkPool pool = new ParkPool();
        pool.addToPool(Creator.createParkFirst());
        pool.addToPool(Creator.createParkSecond());
        pool.addToPool(Creator.createParkThird());

        for (int i = 0; i < 50; i++) {
            new Car(pool).start();
        }
    }
}
