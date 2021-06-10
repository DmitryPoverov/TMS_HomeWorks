package HW.Task7;

public class Rectangle extends Shape {

    int x1, y1, x2, y2;

    public Rectangle() {
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, int x1, int y1, int x2, int y2 ) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setXY1(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setXY2(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void draw() {
        System.out.printf("""
                \nHere is a rectangle.
                Its tops coordinates are [%d;%d] [%d;%d]
                Its color is %s
                """, x1, y1, x2, y2, getColor());
    }
}
