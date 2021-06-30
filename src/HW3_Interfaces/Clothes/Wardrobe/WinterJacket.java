package HW3_Interfaces.Clothes.Wardrobe;

import HW3_Interfaces.Clothes.Clothes_Interface.Jacket_Interface;
import HW3_Interfaces.Clothes.Utils.Colors;

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
        System.out.println("- a winter " + color.getColor() + " jacket. Price: " + price);
    }

    @Override
    public void takeOff() {
        System.out.println("- a winter " + color.getColor() + " jacket.");
    }
}