package HW.Task1_2.Utilities;

import HW.Task1_2.Car;
import java.util.Random;

public class CarFactory {

    public static Car[] carGenerator(int num) {
        Car[] cars = new Car[num];
        Random rnd = new Random();

        for (int i=0; i<num; i++) {
            cars[i] = new Car(Brands.values()[rnd.nextInt(Brands.values().length)].toString(),
                    rnd.nextInt(150)+100,
                    (rnd.nextInt(10)+5)*100);
        }
        return cars;
    }
}
