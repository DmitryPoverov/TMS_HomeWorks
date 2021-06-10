package HW.Task7;

public class Running {

    public static void main(String[] args) {

        Triangle shape1 = new Triangle("Yellow", 2, 5);

        Triangle shape2 = new Triangle("Blue");
        shape2.setXY(4, 6);

        Triangle shape3 = new Triangle();
        shape3.setColor("Green");
        shape3.setXY(7,9);

        Rectangle shape4 = new Rectangle("Red", 2, 3, 9, 7);
        Rectangle shape5 = new Rectangle("Brown");

        shape5.setXY1(3, 3);
        shape5.setXY2(6,7);

        Rectangle shape6 = new Rectangle();
        shape6.setColor("White");
        shape6.setXY1(4,9);
        shape6.setXY2(6,8);

        Shape[] shapes = {shape1, shape2, shape3, shape4, shape5, shape6};

        for (Shape s: shapes) {
            s.draw();
        }

    }
}
