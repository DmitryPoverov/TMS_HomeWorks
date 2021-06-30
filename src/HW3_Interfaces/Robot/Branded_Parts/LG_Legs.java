package HW3_Interfaces.Robot.Branded_Parts;

import HW3_Interfaces.Robot.Robot_Interface.Legs;

public class LG_Legs implements Legs {

    private int price;

    public LG_Legs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("These are LG legs.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
