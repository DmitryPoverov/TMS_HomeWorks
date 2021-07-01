package HW3_Interfaces.Cosmodrome;

import HW3_Interfaces.Cosmodrome.Interfase.IStart;

public class Vostochniy {

    public void Launch(IStart object) {
        if (object.preLaunch()) {
            System.out.println("Молотком постучи и поехали дальше.");
            object.engineStart();
            object.start();
        } else {
            System.out.println("Ну, комический корабль, это тебе не коников из говна лепить: всяко бывает.");
        }
    }
}
