package HW.HW_Examples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queue_Examples {
    public static void main(String[] args) {

        Deque <String> example1 = new ArrayDeque<>(); // есть ли смысл наследовать от Queue, а не от Deque
                                                      // ограничевается список доступных методов
        try  {
            example1.element();
        }
        catch (NoSuchElementException exc) {
            System.err.println("The Queue is empty.");
        }

        example1.add("1 entry");
        example1.offer("2 entry");
        example1.addFirst("New 1 entry");
        example1.addLast("The last entry");

        for (String str: example1) {
            System.out.println(str);
        }

        System.out.println("The first element: " + example1.peek());
        System.out.println("The first and deleted element: " + example1.poll());

        try  {
            example1.remove();
        }
        catch (NoSuchElementException exc) {
            System.err.println("Such element is missing.");
        }

        boolean b1 = example1.offerFirst("OfferFirst() string addition");
        System.out.println(b1);

        b1 = example1.offerLast("OfferingLast() string addition");
        System.out.println(b1);

        example1.push("Push() string addition tо the beginning");
        example1.push("#");

        example1.add("#");

        System.out.println("_________________________________________");
        for (String str: example1) {
            System.out.println(str);
        }
        System.out.println("_________________________________________");

        b1 = example1.removeFirstOccurrence("#");
        System.out.println(b1);

        b1 = example1.removeLastOccurrence("#");
        System.out.println(b1);

        System.out.println("_________________________________________");
        for (String str: example1) {
            System.out.println(str);
        }
        System.out.println("_________________________________________");
    }
}
