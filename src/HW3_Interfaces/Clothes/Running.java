package HW3_Interfaces.Clothes;

import HW3_Interfaces.Clothes.Clothes_Interface.Thing;
import HW3_Interfaces.Clothes.Utils.Colors;
import HW3_Interfaces.Clothes.Wardrobe.*;

public class Running {

    public static void main(String[] args) {

        Thing clothes1 = new SummerJacket(13, Colors.COLOR1);
        Thing clothes3 = new SummerPants(32, Colors.COLOR3);
        Thing clothes5 = new SummerShoes(51, Colors.valueOf("COLOR5"));
        Thing clothes2 = new WinterJacket(32, Colors.COLOR2);
        Thing clothes4 = new WinterPants(28, Colors.valueOf("COLOR4"));
        Thing clothes6 = new WinterShoes(49, Colors.COLOR6);

        Man man1 = new Man(clothes1, clothes3, clothes5);
        Man man2 = new Man(clothes2, clothes4, clothes6);

        System.out.println("Your man put on:");
        man1.putOn();

        System.out.println();

        System.out.println("Your man took off:");
        man1.takeOff();

        System.out.println();

        System.out.println("Your man put on:");
        man2.putOn();

        System.out.println();

        System.out.println("Your man took off:");
        man2.takeOff();
    }
}