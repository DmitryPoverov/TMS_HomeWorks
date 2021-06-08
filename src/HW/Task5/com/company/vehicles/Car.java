package HW.Task5.com.company.vehicles;

import HW.Task5.com.company.details.Engine;
import HW.Task5.com.company.professions.Driver;

public class Car {

    private String carBrand;
    private String carKlass;
    private int weight;
    Driver driver;
    Engine engine;

    public Car(String carBrand, String carKlass, int weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carKlass = carKlass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car(String carBrand, String carKlass, int weight, String fIO, int seniority, int power, String producer) {
        this.carBrand = carBrand;
        this.carKlass = carKlass;
        this.weight = weight;
        driver = new Driver(fIO, seniority);
        engine = new Engine(power, producer);
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public void setCarKlass(String carKlass) {
        this.carKlass = carKlass;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCarBrand() {
        return carBrand;
    }
    public String getCarKlass() {
        return carKlass;
    }
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return driver.getFIO();
    }
    public int getSeniority() {
        return driver.getSeniority();
    }

    public void go() {
        System.out.println("Go");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public void turnLeft() {
        System.out.println("Turning to the left");
    }
    public void turnRight() {
        System.out.println("Turning to the right");
    }


    public void printInfo () {
        System.out.printf("\nInformation:\n - VEHICLE: %s, %s, %d" +
                            "\n - DRIVER: %s, %d\n - ENGINE: %d, %s\n",
                                carBrand, carKlass, weight,
                                driver.getFIO(), driver.getSeniority(),
                                engine.getPower(), engine.getProducer());
    }

}
