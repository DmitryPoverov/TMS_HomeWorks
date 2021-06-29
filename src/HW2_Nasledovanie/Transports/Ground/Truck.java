package HW2_Nasledovanie.Transports.Ground;

import HW2_Nasledovanie.Utils.VehicleBrand;

public class Truck extends GroundTransport {

    private final int lifting;

    public Truck(int power, int weight, VehicleBrand vehicle, int wheelNumber, double fuelConsumption, int lifting) {
        super(power, weight, vehicle, wheelNumber, fuelConsumption);
        this.lifting = lifting;
    }

    public int getLifting() {
        return lifting;
    }

    public void checkCargo(int cargo) {
        if (!(cargo > getLifting())) {
            System.out.println("Your cargo is loaded.");
        } else {
            System.out.println("You need a bigger truck.");
        }
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() + " (" + getCountry() + "), power: " + getPower()
                + "/" + getPower()*0.74 + ", maxSpeed: " + getMaxSpeed() + ", weight:" + getWeight()
                + ", wheels: " + getWheelNumber() + ", fuel consumption: " + getFuelConsumption()
                + ", lifting: " + getLifting();
    }
}
