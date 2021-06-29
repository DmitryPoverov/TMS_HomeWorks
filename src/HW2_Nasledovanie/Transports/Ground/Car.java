package HW2_Nasledovanie.Transports.Ground;

import HW2_Nasledovanie.Utils.VehicleBrand;

public class Car extends GroundTransport{

    private final String bodyType;
    private final int passengerNumber;

    public Car(int power, int weight, VehicleBrand brandEnum, int wheelNumber,
               double fuelConsumption, String bodyType, int passengerNumber) {
        super(power, weight, brandEnum, wheelNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.passengerNumber = passengerNumber;
    }

    public String getBodyType() {
        return bodyType;
    }
    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void howKilometers(double time) {
        double distance = getMaxSpeed() * time;
        System.out.printf("""

                For %.2f hours the %s with max speed %d km/h will go %.2f km and will consume %.2fl of fuel.
                """, time, getBrand(), getMaxSpeed(), distance, fuelVolume(distance));
    }

    private double fuelVolume(double distance) {
        return distance / getFuelConsumption();
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() + " (" + getCountry() + "), power: " + getPower()
                + "/" + getPower()*0.74 + ", maxSpeed: " + getMaxSpeed() + ", weight:" + getWeight()
                + ", wheels: " + getWheelNumber() + ", fuel consumption: " + getFuelConsumption()
                + ", body type: " + getBodyType() + ", passengers number: " + getPassengerNumber();
    }
}
