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

        Comparator<Dog> dCompN_A = new DogComparator1().thenComparing(new DogComparator2());
        Comparator<Dog> dCompA = new DogComparator1();
        Comparator<Dog> dCompN = new DogComparator2();
        Comparator<Dog> dCompW = new DogComparator3();


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

        System.out.println("\nkennel5-Age------------------------");

        SortedSet<Dog> kennel5 = new TreeSet<>(dCompA);
        kennel5.add(dog1);
        kennel5.add(dog2);
        kennel5.add(dog3);
        kennel5.add(dog4);
        kennel5.add(dog5);
        kennel5.add(dog6);
        for (Dog d: kennel5) {
            System.out.println(d);
        }

        System.out.println("\nkennel1_Name-Age------------------");
        kennel1.add(dog4);
        kennel1.add(dog5);
        kennel1.add(dog6);
        kennel1.sort(dCompN_A);
        for (Dog d: kennel1) {
            System.out.println(d);
        }

        System.out.println("\nkennel5_Name-----------------------");
        kennel5 = new TreeSet<>(dCompN);
        kennel5.addAll(kennel1);
        kennel5.addAll(kennel2);
        for (Dog d: kennel5) {
            System.out.println(d);
        }

        System.out.println("\nkennel6----------------------------");
        Map<Integer, Dog> kennel6 = new HashMap<>();
        kennel6.put(1000, dog0);
        kennel6.put(22, dog1);
        kennel6.put(103, dog2);
        kennel6.put(5, dog3);
        kennel6.put(69, dog4);
        kennel6.put(17, dog5);
        kennel6.put(800, dog6);

        boolean b = kennel6.containsKey(1);
        System.out.println(b);

        b = kennel6.containsValue(dog0);
        System.out.println(b);

        b = kennel6.equals(kennel1);
        System.out.println(b);

        b = kennel6.isEmpty();
        System.out.println(b);

        Dog dog10 = kennel6.get(5);
        System.out.println("dog10: " + dog10);

        dog10 = kennel6.get(10);
        System.out.println("dog10: " + dog10);

        kennel6.putIfAbsent(5, dog10);

        System.out.println("\nkennel6----------------------------");
        System.out.println(kennel6.size());

        System.out.println("\nkennel6----------------------------");
        for(Dog d: kennel6.values()) {
            System.out.println(d);
        }

        System.out.println("\nkennel6----------------------------");
        for(int i: kennel6.keySet()) {
            System.out.println(i);
        }
    }
}