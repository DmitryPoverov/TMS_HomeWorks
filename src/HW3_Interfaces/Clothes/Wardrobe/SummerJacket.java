package HW3_Interfaces.Clothes.Wardrobe;

import HW3_Interfaces.Clothes.Clothes_Interface.Jacket_Interface;
import HW3_Interfaces.Clothes.Utils.Colors;

public class SummerJacket implements Jacket_Interface {

    private int price;
    private Colors color;

    public SummerJacket(int price, Colors color) {
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
        System.out.println("- a summer " + color.getColor() + " jacket");
    }

    @Override
    public void takeOff() {
        System.out.println("- a summer " + color.getColor() + " jacket");
    }
}