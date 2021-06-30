package HW3_Interfaces.Clothes_Complicated.Wardrobe;

import HW3_Interfaces.Clothes_Complicated.Clothes_Interface.Shoes_Interface;
import HW3_Interfaces.Clothes_Complicated.Utils.Colors;

public class SummerShoes implements Shoes_Interface {

    private int price;
    private Colors color;

    public SummerShoes(int price, Colors color) {
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
        System.out.println("- a summer " + color.getColor() + " shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("- a summer " + color.getColor() + " shoes");
    }
}