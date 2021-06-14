package HW.Task_Additional_4;

public class Skirt extends Dress implements ToDressWoman{

    public Skirt (Sizes s, int price, String color) {
        super(s, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("\nA woman skirt.\n");
    }

/*    @Override
    public String toString() {
        return "Size: " + size.getEuroSize()
                + ". Price: " + price
                + ". Color: " + color;
    }*/

    @Override
    public String toString() {
        return "Skirt: " +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + ".";
    }

}
