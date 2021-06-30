package HW3_Interfaces.Robot.Branded_Parts;

import HW3_Interfaces.Robot.Robot_Interface.Hands;

public class LG_Hands implements Hands {

    private int price;

    public LG_Hands(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("These are hands LG.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
