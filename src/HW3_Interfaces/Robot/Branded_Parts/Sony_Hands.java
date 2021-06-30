package HW3_Interfaces.Robot.Branded_Parts;

import HW3_Interfaces.Robot.Robot_Interface.Hands;

public class Sony_Hands implements Hands {

    private int price;

    public Sony_Hands(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("These are hands Sony.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
