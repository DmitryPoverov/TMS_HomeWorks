package HW.HW_Examples.Comparable_Example;

import java.util.Comparator;

public class DogComparator1 implements Comparator<Dog> {

    @Override
    public int compare(Dog d1, Dog d2) {
        int i = 0;
        if (d1.getAge() < d2.getAge()) {
            i = -1;
        } else if (d1.getAge() > d2.getAge()) {
            i = 1;
        } else if (d1.getAge() == d2.getAge()) {
            i = 0;
        }
        return i;
    }
}
