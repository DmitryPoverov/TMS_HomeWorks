package HW.Task5;

import HW.Task5.com.company.details.Engine;
import HW.Task5.com.company.professions.Driver;
import HW.Task5.com.company.vehicles.Car;
import HW.Task5.com.company.vehicles.Lorry;
import HW.Task5.com.company.vehicles.SportCar;

public class Running {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Jackson P.S.", 15);
        Engine engine1 = new Engine(105, "Nissan");
        Engine engine2 = new Engine(1090, "Man");

        Car car1 = new Car("Reno", "B", 1750, driver1, engine1);
        car1.printInfo();

        Car car2 = new Car("Toyota", "B", 2110, "Thornton B.J.", 12, 209, "Toyota");
        car2.printInfo();

        Lorry car3 = new Lorry("Man", "Track", 4050, driver1, engine2, 12050);
        car3.printInfo();

        SportCar car4 = new SportCar("Porch", "retro", 1460, car2.getName(), car2.getSeniority(), 410, "RR", 285);
        car4.printInfo();

        car1.go();
        car2.stop();
        car3.turnLeft();
        car4.turnRight();

    }
}
