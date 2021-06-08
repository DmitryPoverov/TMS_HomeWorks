package HW.Task5.com.company.vehicles;

import HW.Task5.com.company.details.Engine;
import HW.Task5.com.company.professions.Driver;

public class SportCar extends Car {

    private int speedLimit;

    public SportCar(String carBrand, String carKlass, int weight, Driver driver, Engine engine, int speedLimit) {
        super(carBrand, carKlass, weight, driver, engine);
        this.speedLimit = speedLimit;
    }

    public SportCar(String carBrand, String carKlass, int weight, String fIO, int seniority, int power, String producer, int speedLimit) {
        super(carBrand, carKlass, weight, fIO, seniority, power, producer);
        this.speedLimit = speedLimit;
    }

    public void printInfo () {
        System.out.printf("\nInformation:\n - VEHICLE: %s, %s, %d" +
                        "\n - DRIVER: %s, %d\n - ENGINE: %d, %s\n - SPEED LIMIT: %d\n",
                getCarBrand(), getCarKlass(), getWeight(),
                driver.getFIO(), driver.getSeniority(),
                engine.getPower(), engine.getProducer(), speedLimit);
    }
}
