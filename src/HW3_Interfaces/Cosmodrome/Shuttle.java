package HW3_Interfaces.Cosmodrome;

import HW3_Interfaces.Cosmodrome.Interfase.IStart;
import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean preLaunch() {
        Random rnd = new Random();
        return rnd.nextInt(11) >= 3;
    }

    @Override
    public void engineStart() {
        System.out.println("STAGE 2). The shuttle engines were started. " +
                           "All systems are working well.");
    }

    @Override
    public void start() {
        System.out.println("STAGE 3). The shuttle started.");
    }
}
