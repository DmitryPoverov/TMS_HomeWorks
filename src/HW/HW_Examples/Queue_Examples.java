package HW.HW_Examples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queue_Examples {
    public static void main(String[] args) {

        Deque <String> example1 = new ArrayDeque<>(); // есть ли смысл наследовать от Queue, а не от Deque

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


    }
}
