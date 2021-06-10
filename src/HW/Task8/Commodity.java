package HW.Task8;

class Commodity {

    private String name;
    private int price;       // поле "рейтинг" убрал из-за лени

    public Commodity() {
    }

    protected Commodity (String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected void setName(String name) {
        this.name = name;
    }
    protected void setPrice(int price) {
        this.price = price;
    }

    protected String getName() {
        return name;
    }
    protected int getPrice() {
        return price;
    }
}
