package HW.Task7;

public class Triangle extends Shape {

    private int x, y;

    public Triangle() {
    }

    public Triangle(String color) {
        super(color);
    }

    public Triangle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.printf("""
                \nHere is a triangle.
                Its top coordinates are [%d;%d]
                Its color is %s
                """, x, y, super.getColor());
    }
}
