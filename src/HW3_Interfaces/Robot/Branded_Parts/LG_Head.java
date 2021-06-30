package HW3_Interfaces.Robot.Branded_Parts;

import HW3_Interfaces.Robot.Robot_Interface.Head;

public class LG_Head implements Head {

    private int price;

    public LG_Head(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("It's a LG head.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
