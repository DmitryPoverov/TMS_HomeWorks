package HW.Task1;
import HW.Task1.Utilities.CarHandler;

public class Running {

    public static void main(String[] args) {

        Car1 car1 = new Car1("VW", 180, 5_000);
        Car1 car2 = new Car1("Volvo", 190, 10_000);
        Car1 car3 = new Car1("Honda", 200, 8_000);
        Car1 car4 = new Car1("Mazda", 210, 9_000);

        CarHandler.CarHandler(car1, car2, car3, car4);

    }
}