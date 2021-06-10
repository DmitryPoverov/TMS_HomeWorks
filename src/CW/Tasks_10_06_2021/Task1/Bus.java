package CW.Tasks_10_06_2021.Task1;

public class Bus extends Movable implements Interface{

    @Override
    public void moveRight() {
        System.out.println("The vehicle turns right");
    }

    public void moveLeft() {
        System.out.println("The vehicle turns left");
    }

}
