package HW3_Interfaces.Clothes;

import HW3_Interfaces.Clothes.Clothes_Interface.Thing;

public class Man {

    Thing jacket;
    Thing pants;
    Thing shoes;

    public Man(Thing jacket, Thing pants, Thing shoes) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

}