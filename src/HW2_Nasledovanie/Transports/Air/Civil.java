package HW2_Nasledovanie.Transports.Air;

import HW2_Nasledovanie.Utils.VehicleBrand;

public class Civil extends AirTransport {

    private final int passenger;
    private final boolean businessClass;


    public Civil(int power, int weight, VehicleBrand vehicle, int wingspan,
                 int runwayStrip, int passenger, boolean businessClass) {
        super(power, weight, vehicle, wingspan, runwayStrip);
        this.passenger = passenger;
        this.businessClass = businessClass;
    }

    public int getPassenger() {
        return passenger;
    }
    public boolean isBusinessClass() {
        return businessClass;
    }

    public void checkPassenger(int passengers) {
        if (!(getPassenger() < passengers)) {
            System.out.println("Your passengers are seated.");
        } else {
            System.out.println("There is not enough of places.");
        }
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() + " (" + getCountry() + "), power: " + getPower()
                + "/" + getPower()*0.74 + ", maxSpeed: " + getMaxSpeed() + ", weight:" + getWeight()
                + ", wings: " + getWingspan() + ", runway strip: " + getRunwayStrip()
                + ", passengers: " + getPassenger() + ", business class: " + isBusinessClass();
    }
}
