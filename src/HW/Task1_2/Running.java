package HW.Task1_2;

import HW.Task1_2.Utilities.CarFactory;
import HW.Task1_2.Utilities.StartCar;

public class Running {

    public static void main(String[] args) {

        StartCar.starter(CarFactory.carGenerator(20));

    }
}
