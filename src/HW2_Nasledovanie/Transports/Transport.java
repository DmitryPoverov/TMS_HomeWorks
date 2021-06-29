package HW2_Nasledovanie.Transports;

import HW2_Nasledovanie.Utils.VehicleBrand;

public class Transport {

    private final int power;
    private final int weight;
    private final int maxSpeed;
    private final String brand;
    private final String country;

    public Transport(int power, int weight, VehicleBrand vehicle) {
        this.power = power;
        maxSpeed = vehicle.getMaxSpeed();
        this.weight = weight;
        this.brand = vehicle.toString();
        country = vehicle.getCountry();
    }

    public int getPower() {
        return power;
    }
    public int getWeight() {
        return weight;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getBrand() {
        return brand;
    }
    public String getCountry() {
        return country;
    }
}
