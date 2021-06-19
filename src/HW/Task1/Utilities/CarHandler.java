package HW.Task1.Utilities;

import HW.Task1.Car1;
import HW.Task1.Exceptions.OddNumberException;

public class CarHandler {

    public static void CarHandler(Car1... cars) {
        int successful = 0;
        int unsuccessful = 0;
        for (Car1 c: cars) {
            try {
                c.start();
                System.out.printf("Car %s started successfully\n", c.getBrand());
                successful++;
            } catch (OddNumberException exc) {
                System.out.println(exc);
                unsuccessful++;
            }
        }
        System.out.println("Successfully started: " + successful);
        System.out.println("Unsuccessfully started: " + unsuccessful);
    }
}
