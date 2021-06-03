package Lesson6_1;

import Lesson6.*;

public class Main {

    public static void main(String[] args) {

        Human ilya = new Human();

        Human jimmy = new Human("Jimmy");

        ilya.setName("Ilya");
        System.out.println(ilya.getAge());

        System.out.println(ilya.getName());

        Application.main();

        jimmy.setAge(20);

        System.out.println(jimmy.getAge());

        jimmy.showInfo();

        System.out.println("#################################");

        Ability test = new Ability();
        test.setName("Running");

        Human test1 = new Human(test);

        String s = test1.getAbility().getName();

        System.out.println(s);

        test.displayAbility();
    }
}
