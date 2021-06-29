package HW2_Nasledovanie;

import HW2_Nasledovanie.Transports.Air.Civil;
import HW2_Nasledovanie.Transports.Air.Military;
import HW2_Nasledovanie.Transports.Ground.Car;
import HW2_Nasledovanie.Transports.Ground.Truck;
import HW2_Nasledovanie.Transports.Transport;
import HW2_Nasledovanie.Utils.VehicleBrand;

public class Running {
    public static void main(String[] args) {

        Car transport1 = new Car
                (150, 2000, VehicleBrand.MAZDA, 4,
                 8.9, "universal", 5);
        Truck transport2 = new Truck
                (480, 5200, VehicleBrand.VOLVO, 6,
                 39.8, 28000);
        Civil transport3 = new Civil
                (25000, 55000, VehicleBrand.AIRBUS, 29,
                        1200, 149, false);
        Military transport4 = new Military
                (45000, 263000, VehicleBrand.BOEING, 52,
                        2400, false, 48);

        Transport[] transportSet = {transport1, transport2, transport3, transport4};
        for (Transport t : transportSet) {
            System.out.println(t);
        }

        transport1.howKilometers(3.59);
        transport2.checkCargo(28001);
        transport2.checkCargo(2800);
        transport3.checkPassenger(150);
        transport3.checkPassenger(149);
        transport4.checkShot(49);
        transport4.checkShot(48);
        transport4.checkCatapult(false);
        transport4.checkCatapult(true);




    }
}
