package HW3_Interfaces.Cosmodrome;

import HW3_Interfaces.Cosmodrome.Interfase.Soyuz_2;

public class Running {
    public static void main(String[] args) {

        Shuttle rocket1 = new Shuttle();
        Soyuz_2 rocket2 = new Soyuz_2();

        Cosmodrome place1 = new Cosmodrome();
        Vostochniy place2 = new Vostochniy();

        System.out.println("\nAn american rocket:");
        place1.Launch(rocket1);

        System.out.println("\nРусская рокета:");
        place2.Launch(rocket2);
    }
}
