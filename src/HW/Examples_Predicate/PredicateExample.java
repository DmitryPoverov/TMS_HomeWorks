package HW.Examples_Predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

//-----------При помощи лямбда выражений-----------------
        Predicate<Integer> isEven = n -> n%2==0;

        if(isEven.test(4))
            System.out.println("4 is even number.");

        if (!(isEven.test(5)))
            System.out.println("5 is odd number");

//-----------При помощи ссылки на метод------------------
        PredicateClass pc = new PredicateClass();
        Predicate<Integer> pi = pc::isEven;

        if (pi.test(4)) {
            System.out.println("4 is even number.");
        }

        if (!(pi.test(5))) {
            System.out.println("5 is odd number.");
        }
    }
}