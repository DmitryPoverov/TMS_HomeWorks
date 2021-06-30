package HW3_Interfaces.Clothes_Complicated.Wardrobe;

import HW3_Interfaces.Clothes_Complicated.Clothes_Interface.Pants_Interface;
import HW3_Interfaces.Clothes_Complicated.Utils.Colors;

public class WinterPants implements Pants_Interface {

    private int price;
    private Colors color;

    public WinterPants(int price, Colors color) {
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
        System.out.println("- a winter " + color.getColor() + " pants");
    }

    @Override
    public void takeOff() {
        System.out.println("- a winter " + color.getColor() + " pants");
    }
}