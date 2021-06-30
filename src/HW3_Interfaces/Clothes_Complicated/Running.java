package HW3_Interfaces.Clothes_Complicated;

import HW3_Interfaces.Clothes_Complicated.Clothes_Interface.Thing;
import HW3_Interfaces.Clothes_Complicated.Utils.Colors;
import HW3_Interfaces.Clothes_Complicated.Wardrobe.*;

public class Running {

    public static void main(String[] args) {

        Thing clothes1 = new SummerJacket(13, Colors.COLOR1);
        Thing clothes2 = new WinterJacket(32, Colors.COLOR2);
        Thing clothes3 = new SummerPants(12, Colors.COLOR3);
        Thing clothes4 = new WinterPants(28, Colors.valueOf("COLOR4"));
        Thing clothes5 = new SummerShoes(51, Colors.valueOf("COLOR5"));
        Thing clothes6 = new WinterShoes(49, Colors.COLOR6);

        Man man1 = new Man(76);
        man1.toBuyThing(clothes1);
        man1.toBuyThing(clothes3);
        man1.toBuyThing(clothes5);
        man1.toBuyThing(clothes4);

        man1.PutAllOn();

        System.out.println();

        man1.takeAllOff();

        System.out.println();

        Man man2 = new Man(109);
        man2.toBuyThing(clothes2);
        man2.toBuyThing(clothes4);
        man2.toBuyThing(clothes6);
        man2.toBuyThing(clothes4);

        man2.PutAllOn();

        System.out.println();

        man2.takeAllOff();
    }
}