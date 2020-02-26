import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class CarPark {

    private int parkId;
    private int parkSize;
    private Queue<ParkLot> lots = new ConcurrentLinkedQueue<>();
    private Semaphore semaphore;

    public CarPark(int parkId, int parkSize) {
        this.parkId = parkId;
        this.parkSize = parkSize;
        this.semaphore = new Semaphore(parkSize, true);
    }

    public int getParkId() {
        return parkId;
    }

    public void addToParkLots(ParkLot lot) {
        if (parkSize >= 0) {
            lots.add(lot);
            parkSize--;
        }
    }

    public ParkLot takeLot(long maxWaitMillis) {
        ParkLot toReturn = null;
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                System.out.println("Car #" + Thread.currentThread().getId() + " poll from park #" + CarPark.this.parkId);
                ParkLot lot = lots.poll();
                System.out.println("Car #" + Thread.currentThread().getId() + " poll " + lot);
                toReturn = lot;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    public void returnLot(ParkLot lot) {
        lots.add(lot);
        semaphore.release();
    }
}
