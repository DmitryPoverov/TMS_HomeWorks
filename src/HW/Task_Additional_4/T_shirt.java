package HW.Task_Additional_4;

public class T_shirt extends Dress implements ToDressMan, ToDressWoman {

    public T_shirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("\nA man t-shirt.\n");
    }

    @Override
    public void dressWoman() {
        System.out.printf("\nA woman t-shirt.\n");
    }

/*    @Override
    public String toString() {
        return "Size: " + size.getEuroSize()
                + ". Price: " + price
                + ". Color: " + color;
    }*/

    @Override
    public String toString() {
        return "T_shirt: " +
                "size=" + size +
                ", price=" + price +
                ", color=" + color;
    }
}
