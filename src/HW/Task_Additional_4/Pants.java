package HW.Task_Additional_4;

public class Pants  extends Dress implements ToDressMan, ToDressWoman {

    public Pants(Sizes s, int price, String color) {
        super(s, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("\nA man pants.\n");
    }

    @Override
    public void dressWoman() {
        System.out.printf("\nA woman pants.\n");
    }

/*    @Override
    public String toString() {
        return "Size: " + size.getEuroSize()
                + ". Price: " + price
                + ". Color: " + color;
    }*/

    @Override
    public String toString() {
        return "Pants: " +
                "size=" + size +
                ", price=" + price +
                ", color=" + color + ".";
    }
}
