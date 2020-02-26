import java.util.concurrent.TimeUnit;

public class ParkLot {

    private int lotId;
    private int parkId;

    public ParkLot(int lotId, int parkId) {
        super();
        this.lotId = lotId;
        this.parkId = parkId;
    }

    public int getLotId() {
        return lotId;
    }

    public int getParkId() {
        return parkId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public void using() {
        System.out.println("LOT #" + lotId + " using by Car #" + Thread.currentThread().getId());
        try {
            TimeUnit.MILLISECONDS.sleep(new java.util.Random().nextInt(200));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "LOT #" + lotId + " PARK_ID #" + parkId;
    }
}
