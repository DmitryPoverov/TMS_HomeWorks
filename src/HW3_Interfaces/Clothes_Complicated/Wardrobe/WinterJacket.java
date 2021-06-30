package HW3_Interfaces.Clothes_Complicated.Wardrobe;

import HW3_Interfaces.Clothes_Complicated.Clothes_Interface.Jacket_Interface;
import HW3_Interfaces.Clothes_Complicated.Utils.Colors;

public class WinterJacket implements Jacket_Interface {

    private int price;
    private Colors color;

    public WinterJacket(int price, Colors color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public Colors getColor() {
        return color;
    }

    @Override
    public void putOn() {
        System.out.println("- a " + color.getColor() + " jacket");
    }

    @Override
    public void takeOff() {
        System.out.println("- a winter " + color.getColor() + " jacket");
    }
}