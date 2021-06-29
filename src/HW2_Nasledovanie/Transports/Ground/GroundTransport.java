package HW2_Nasledovanie.Transports.Ground;

import HW2_Nasledovanie.Transports.Transport;
import HW2_Nasledovanie.Utils.VehicleBrand;

public class GroundTransport extends Transport {

    private final int wheelNumber;
    private final double fuelConsumption;


    public GroundTransport(int power, int weight, VehicleBrand vehicle, int wheelNumber, double fuelConsumption) {
        super(power, weight, vehicle);
        this.wheelNumber = wheelNumber;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
