package HW.Task1_2.Utilities;
import HW.Task1_2.Car;
import HW.Task1_2.Exception.OddException;

public class StartCar {

    public static void starter(Car ... car) {
        int successStart = 0;
        int unSuccessStart = 0;
        for (Car c : car) {
            try {
                c.start();
                successStart++;
            } catch (OddException exc) {
                System.out.println(exc);
                unSuccessStart++;
            }
        }
        System.out.println("The successful start: " + successStart);
        System.out.println("Failure: " + unSuccessStart);
    }
}
