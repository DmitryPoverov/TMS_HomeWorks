package HW.Task_Additional_4;

public abstract class Dress {

    Sizes size;
    int price;
    String color;

    public Dress(Sizes s, int price, String color) {
        size = s;
        this.price = price;
        this.color = color;
    }
}
