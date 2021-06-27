package HW.HW_Examples.Comparable_Example;

import java.util.*;

public class Comparable_Examples {
    public static void main(String[] args) {

        Dog dog0 = new Dog(4, "Lassie",  15.8);
        Dog dog1 = new Dog(1, "Lorry", 33.4);
        Dog dog2 = new Dog(6, "Abby", 33.4);
        Dog dog3 = new Dog(4, "Chappy", 33.4);
        Dog dog4 = new Dog(3, "Abby", 4.6);
        Dog dog5 = new Dog(6, "Abby", 33.4);
        Dog dog6 = new Dog(7, "Addy", 13.7);
        Dog dog7 = new Dog(1, "Tammy", 25.1);
        Dog dog8 = new Dog(9, "Timmy", 7.4);
        Dog dog9 = new Dog(11, "Chika", 9.5);

        DogComparator dComp = new DogComparator();

        System.out.println("\nkennel1---------------------------");

        List<Dog> kennel1 = DogAdder.Addition1(dog0, dog1, dog2);
        for (Dog d: kennel1) {
            System.out.println(d);
        }

        System.out.println("\nkennel2---------------------------");

        Deque<Dog> kennel2 = DogAdder.Addition2(dog3, dog4, dog5);
        for (Dog d: kennel2) {
            System.out.println(d);
        }

        System.out.println("\nkennel3---------------------------");

        Set<Dog> kennel3 = DogAdder.Addition3(dog7, dog8, dog9);
        for (Dog d: kennel3) {
            System.out.println(d);
        }

        System.out.println("\nkennel4---------------------------");

        SortedSet<Dog> kennel4 = DogAdder.Addition4(dog2, dog5, dog6);
        for (Dog d: kennel4) {
            System.out.println(d);
        }

        System.out.println("\nkennel5---------------------------");

        SortedSet<Dog> kennel5 = new TreeSet<>(dComp);
        kennel5.add(dog1);
        kennel5.add(dog2);
        kennel5.add(dog3);
        kennel5.add(dog4);
        kennel5.add(dog5);
        kennel5.add(dog6);
        for (Dog d: kennel5) {
            System.out.println(d);
        }

        System.out.println("\nkennel1---------------------------");
        kennel1.add(dog4);
        kennel1.add(dog5);
        kennel1.add(dog6);
        kennel1.sort(dComp);
        for (Dog d: kennel1) {
            System.out.println(d);
        }
    }
}
