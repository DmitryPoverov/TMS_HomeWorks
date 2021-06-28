package HW.HW_Examples.Comparable_Example;

import java.util.Comparator;

public class DogComparator3 implements Comparator<Dog> {

    @Override
    public int compare(Dog d1, Dog d2) {
        int i = 0;
        if (d1.getWeight() < d2.getWeight()) {
            i = -1;
        } else if (d1.getWeight() > d2.getWeight()) {
            i = 1;
        } else if (d1.getWeight() == d2.getWeight()) {
            i = 0;
        }
        return i;
    }

}
