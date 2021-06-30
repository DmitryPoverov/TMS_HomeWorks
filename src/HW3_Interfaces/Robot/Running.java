package HW3_Interfaces.Robot;

import HW3_Interfaces.Robot.Branded_Parts.*;
import HW3_Interfaces.Robot.Robot.Robot_Body;

public class Running {
    public static void main(String[] args) {

        LG_Hands p1 = new LG_Hands(28);
        LG_Head p2 = new LG_Head(38);
        LG_Legs p3 = new LG_Legs(21);

        Sony_Hands p4 = new Sony_Hands(39);
        Sony_Head p5 = new Sony_Head(53);
        Sony_Legs p6 = new Sony_Legs(27);

        Robot_Body r1 = new Robot_Body(p1, p2, p3);
        Robot_Body r2 = new Robot_Body(p4, p5, p6);
        Robot_Body r3 = new Robot_Body(p1, p5, p6);

        r1.Action();
        System.out.println("The price of the robot:\t" + r1.getPrice());
        System.out.println();

        r2.Action();
        System.out.println("The price of the robot:\t" + r2.getPrice());
        System.out.println();

        r3.Action();
        System.out.println("The price of the robot:\t" + r3.getPrice());
        System.out.println();

        System.out.println("The most expensive robot costs: " + Robot_Body.theMostExpensive(r1, r2, r3));
    }
}
