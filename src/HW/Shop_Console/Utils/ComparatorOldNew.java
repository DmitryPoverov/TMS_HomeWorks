package HW.Shop_Console.Utils;

import HW.Shop_Console.Goods;
import java.util.Comparator;

public class ComparatorOldNew implements Comparator<Goods> {

    @Override
    public int compare(Goods o1, Goods o2) {
        return Integer.compare(o2.getPlace(), o1.getPlace());
    }
}