package HW3_Interfaces.Cosmodrome;

import HW3_Interfaces.Cosmodrome.Interfase.IStart;

public class Cosmodrome {

    public void Launch(IStart object) {
       if (object.preLaunch()) {
           System.out.println("STAGE 1). Pre-launch checking passed.");
           object.engineStart();
           object.start();
       } else {
           System.out.println("ATTENTION!!! Pre-launch checking is failed. The rocket launching canceled.");
       }
    }
}