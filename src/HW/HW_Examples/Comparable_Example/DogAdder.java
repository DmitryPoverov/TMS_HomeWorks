package HW.HW_Examples.Comparable_Example;

import java.util.*;

public class DogAdder {

    public static List<Dog> Addition1(Dog... set) {
        List<Dog> dg = new ArrayList<>();
        for (Dog d: set) {
            dg.add(d);
        }
        return dg;
    }

    public static Deque<Dog> Addition2(Dog... set) {
        ArrayDeque<Dog> dg = new ArrayDeque<>();
        for (Dog d: set) {
            dg.add(d);
        }
        return dg;
    }

    public static Set<Dog> Addition3(Dog... set) {
        Set<Dog> dg = new HashSet<>();
        for (Dog d: set) {
            dg.add(d);
        }
        return dg;
    }

    public static SortedSet<Dog> Addition4(Dog... set) {
        SortedSet<Dog> dg = new TreeSet<>();
        for (Dog d: set) {
            dg.add(d);
        }
        return dg;
    }

}
