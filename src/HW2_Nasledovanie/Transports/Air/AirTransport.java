package HW2_Nasledovanie.Transports.Air;

import HW2_Nasledovanie.Transports.Transport;
import HW2_Nasledovanie.Utils.VehicleBrand;

public class AirTransport extends Transport {

    private final int wingspan;
    private final int runwayStrip;

    public AirTransport(int power, int weight, VehicleBrand vehicle, int wingspan, int runwayStrip) {
        super(power, weight, vehicle);
        this.wingspan = wingspan;
        this.runwayStrip = runwayStrip;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getRunwayStrip() {
        return runwayStrip;
    }
}
