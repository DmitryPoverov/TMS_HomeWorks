package HW.HW11.SerializeAuto;

import java.io.*;

public class Running {
    public static void main(String[] args) {

        Auto newCar1 = new Auto("Citroen", 15000, 210);

        try (ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream("Auto.dat"))) {
            oOS.writeObject(newCar1);
        }
        catch (IOException iOE) {
            System.out.println(iOE.getMessage());
        }

        Auto newCar2 = null;

        try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream("Auto.dat"))) {
            newCar2 = (Auto) oIS.readObject();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(newCar2);

    }
}
