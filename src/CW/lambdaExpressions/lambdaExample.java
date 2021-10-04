package CW.lambdaExpressions;

import java.util.function.Predicate;

public class lambdaExample {
    public static void main(String[] args) {

        Predicate <Integer> p1 = g -> g == 7;
        Predicate <Integer> p2 = g -> g == 8;

        System.out.println(p1.or(p2).test(7));
        System.out.println(p1.and(p2).test(7));
    }
}