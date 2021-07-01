package CW.Exam_Collect;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {

        List <String> people = new ArrayList<>();

        people.add("Tom");
        people.add("Tim");
        people.add("Tod");
        people.add("Bob");

        people.add(10, "");   // добавлять можно только в существующие ячейки
        for (String s:people) {
            System.out.printf("|%10s", s);
        }

        System.out.println();
        people.add(0, "Alice");
        for (String s:people) {
            System.out.printf("|%10s", s);
        }

        System.out.println();
        people.set(1, "Victoria");
        for (String s:people) {
            System.out.printf("|%10s", s);
        }
    }
}
