package HW.Task5.com.company.vehicles;

import HW.Task5.com.company.details.Engine;
import HW.Task5.com.company.professions.Driver;

public class Lorry extends Car{

    private int carrying;

    public Lorry (String carBrand, String carKlass, int weight, Driver driver, Engine engine, int carrying) {
        super(carBrand, carKlass, weight, driver, engine);
        this.carrying = carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }                                       // get-set carrying
    public int getCarrying() {
        return carrying;
    }

    public void printInfo () {
        System.out.printf("\nInformation:\n - VEHICLE: %s, %s, %d" +
                        "\n - DRIVER: %s, %d\n - ENGINE: %d, %s\n - CARRYING: %d\n",
                getCarBrand(), getCarKlass(), getWeight(),
                driver.getFIO(), driver.getSeniority(),
                engine.getPower(), engine.getProducer(), carrying);
    }
}
