package HW.Task1_2.Exception;

import HW.Task1_2.Car;

public class OddException extends Exception {

    private Car car;
    private final int brokeNumber;

    public OddException(Car car, int brokeNumber) {
        this.car = car;
        this.brokeNumber = brokeNumber;
    }

    @Override
    public String toString() {
        return "\t\tOddException!!! " + car.getBrand() + " (" + car.getPrice3() + "|" + car.getSpeed3() + ") has fail. Breaking number: " + brokeNumber;
    }
}
