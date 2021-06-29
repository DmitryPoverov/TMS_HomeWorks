package HW2_Nasledovanie.Transports.Air;

import HW2_Nasledovanie.Utils.VehicleBrand;

public class Military extends AirTransport{

    boolean catapult;
    int rocketNumber;


    public Military(int power, int weight, VehicleBrand vehicle, int wingspan,
                    int runwayStrip, boolean catapult, int rocketNumber) {
        super(power, weight, vehicle, wingspan, runwayStrip);
        this.catapult = catapult;
        this.rocketNumber = rocketNumber;
    }

    public boolean isCatapult() {
        return catapult;
    }
    public int getRocketNumber() {
        return rocketNumber;
    }

    public void checkShot(int rockets) {
        if ((rockets <= getRocketNumber()) && (rockets != 0)) {
            System.out.println("Rockets is realised.");
        } else {
            System.out.println("Rockets is NOT realised.");
        }
    }

    public void checkCatapult(boolean necessityToCatapult) {
        if (necessityToCatapult && isCatapult()) {
            System.out.println("Your pilot is catapulted");
        } else if (necessityToCatapult && !isCatapult()){
            System.out.println("Your pilot doesn't have possibility to catapult.");
        } else {
            System.out.println("Your pilot doesn't want to catapult.");
        }
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() + " (" + getCountry() + "), power: " + getPower() + "/"
                + getPower()*0.74 + ", maxSpeed: " + getMaxSpeed() + ", weight:" + getWeight()
                + ", wings: " + getWingspan() + ", runway strip: " + getRunwayStrip()
                + ", catapult: " + isCatapult() + ", rocket number: " + getRocketNumber();
    }
}
