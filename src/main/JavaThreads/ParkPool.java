import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class ParkPool {

    private ReentrantLock lock = new ReentrantLock();
    private ArrayList<CarPark> pool = new ArrayList<>();

    public ParkPool() {
    }

    public void addToPool(CarPark park) {
        pool.add(park);
    }

    public ParkLot getLot(long maxWaitMillis) {
        System.out.println("Car #" + Thread.currentThread().getId() + " tried to getLot");
        ParkLot toReturn = null;
        for (CarPark park : pool) {
            ParkLot lot = park.takeLot(maxWaitMillis);
            if (lot != null) {
                toReturn = lot;
                break;
            } else {
                System.out.println("Car #" + Thread.currentThread().getId() + " -> timeout. Going to another parking.");
            }
        }
        return toReturn;
    }

    public boolean returnLot(ParkLot lot) {
        boolean toReturn = false;
        if (lock.tryLock()) {
            for (CarPark park : pool) {
                if (park.getParkId() == lot.getParkId()) {
                    park.returnLot(lot);
                }
            }
            toReturn = true;
            lock.unlock();
        }
        return toReturn;
    }
}
