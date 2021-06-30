package HW3_Interfaces.Robot.Robot;

import HW3_Interfaces.Robot.Robot_Interface.Hands;
import HW3_Interfaces.Robot.Robot_Interface.Head;
import HW3_Interfaces.Robot.Robot_Interface.Legs;

public class Robot_Body implements HW3_Interfaces.Robot.Robot_Interface.Robot {
    Hands hands;
    Head head;
    Legs legs;

    public Robot_Body(Hands hands, Head head, Legs legs) {
        this.hands = hands;
        this.head = head;
        this.legs = legs;
    }

    public static int theMostExpensive(Robot_Body... robots) {
        int temp = 0;
        for (Robot_Body pr : robots) {
            if (pr.getPrice() > temp) {
                temp = pr.getPrice();
            }
        }
        return temp;
    }

    @Override
    public void Action() {
        System.out.println("I'm a robot.");
        hands.upHand();
        head.speak();
        legs.step();
    }

    @Override
    public int getPrice() {
        return hands.getPrice() + head.getPrice() + legs.getPrice();
    }
}
