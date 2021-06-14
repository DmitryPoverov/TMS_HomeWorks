package HW.Task_Additional_4;

public class Tie extends Dress implements ToDressMan{

    public Tie (Sizes s, int price, String color) {
        super(s, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("\nA man tie.\n");
    }

/*    @Override
    public String toString() {
        return "Size: " + size.getEuroSize()
                + ". Price: " + price
                + ". Color: " + color;
    }*/

    @Override
    public String toString() {
        return "Tie: " +
                "size=" + size +
                ", price=" + price +
                ", color=" + color;
    }

}
