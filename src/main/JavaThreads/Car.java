public class Car extends Thread {

    private boolean standing;
    private ParkPool pool;

    public Car(ParkPool pool) {
        this.pool = pool;
        System.out.println("Car #" + this.getId() + " is created");
    }

    public void run() {
        this.setName("Car-" + this.getId());
        ParkLot lot = null;
        while (lot == null) {
            lot = pool.getLot(500);
        }
        standing = true;
        lot.using();
        standing = false;
        while (true) {
            if (pool.returnLot(lot)) {
                break;
            }
        }
    }

    public boolean isStanding() {
        return standing;
    }
}
