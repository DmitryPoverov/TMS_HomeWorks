package HW.Shop_Console.Utils;

import HW.Shop_Console.Goods;
import java.util.Comparator;

public class ComparatorPriceUp implements Comparator<Goods> {

    @Override
    public int compare(Goods o1, Goods o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
