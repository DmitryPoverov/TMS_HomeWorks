package HW3_Interfaces.Robot.Branded_Parts;

import HW3_Interfaces.Robot.Robot_Interface.Head;

public class Sony_Head implements Head {

    private int price;

    public Sony_Head(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("It's a Sony head.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
