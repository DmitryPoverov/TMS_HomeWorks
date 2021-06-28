package HW.HW_Examples.Comparable_Example;

import java.util.Comparator;

public class DogComparator2 implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
