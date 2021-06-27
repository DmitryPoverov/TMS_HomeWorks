package HW.HW_Examples.Comparable_Example;

import java.util.*;

public class Comparable_Examples {
    public static void main(String[] args) {

        Dog dog1 = new Dog(4, "Lassie",  15.8);
        Dog dog2 = new Dog(6, "Abby", 33.4);
        Dog dog3 = new Dog(4, "Chappy", 33.4);
        Dog dog4 = new Dog(3, "Abby", 4.6);

        System.out.println("----------------------------");

        List<Dog> kennel1 = DogAdder.Addition1(dog1, dog2, dog3, dog4);
        for (Dog d: kennel1) {
            System.out.println(d);
        }

        System.out.println("----------------------------");

        Deque<Dog> kennel2 = DogAdder.Addition2(dog1, dog2, dog3, dog4);
        for (Dog d: kennel2) {
            System.out.println(d);
        }

        System.out.println("----------------------------");

        Set<Dog> kennel3 = DogAdder.Addition3(dog1, dog2, dog3, dog4);
        for (Dog d: kennel3) {
            System.out.println(d);
        }

        System.out.println("----------------------------");

        SortedSet<Dog> kennel4 = DogAdder.Addition4(dog1, dog2, dog3, dog4);
        for (Dog d: kennel4) {
            System.out.println(d);
        }

        System.out.println("----------------------------");
    }
}
