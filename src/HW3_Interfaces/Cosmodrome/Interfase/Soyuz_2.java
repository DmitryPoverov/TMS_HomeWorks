package HW3_Interfaces.Cosmodrome.Interfase;

import java.util.Random;

public class Soyuz_2 implements IStart {


    @Override
    public boolean preLaunch() {
        Random rnd = new Random();
        return rnd.nextInt(2) == 1;
    }

    @Override
    public void engineStart() {
        System.out.println("Валера, бля, поднажми: почти завелась.");
    }

    @Override
    public void start() {
        System.out.println("Ну, с богом.");
    }

}
