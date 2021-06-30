package HW3_Interfaces.Robot.Branded_Parts;

import HW3_Interfaces.Robot.Robot_Interface.Legs;

public class Sony_Legs implements Legs {

    private int price;

    public Sony_Legs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("These are Sony legs.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
