// Разобраться со всеми интерфейсами и их реализациями.
// Попробовать руками все структуры данных и их возможности:
// • Добавлять
// • Удалять
// • Изменять
// • Поиск
// • Сортировка
// • и т. д

package HW.HW_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class List_Examples /*implements Comparable <String>*/{
    public static void main(String[] args) {

        List <String> example1 = new ArrayList<>();
        example1.add("example 1: addition 1");
        example1.add("example 1: addition 2");

        List <String> example2 = new ArrayList<>();
        example2.add("example 2: addition 1");

        boolean b1 = example2.addAll(1, example1);     // добавляет и возвращает boolean

        example1.add("examples 1: addition 3");

        boolean b2 = example2.addAll(example1);

        example2.add("examples 2: addition 2");
        example2.set(5, "#");
        for (String str: example2) {
            System.out.println(str);
        }

        System.out.println("5 object is : " + example2.get(5));

        System.out.println("examples1 size: " + example1.size());
        System.out.println("examples2 size: " + example2.size());

        example1.remove(1);
        example2.remove(1);

        System.out.println("examples1 size: " + example1.size());
        System.out.println("examples2 size: " + example2.size());

        for (String str: example2.subList(1,4)) {
            System.out.println(str);
        }

        System.out.println("\n_________________________________________");

        Object[] objArr = example2.toArray();

        for (Object item: objArr) {
            System.out.println(item);
        }

        System.out.println(example2.indexOf("#"));

        System.out.println("\nhasNext__________________________________");

        ListIterator<String> li = example2.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("\nhasPrevious______________________________");

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        System.out.println("\n_________________________________________");

        for (String s: example2) {
            System.out.println(s);
        }

        System.out.println("\n_________________________________________");
        List<String> example3 = List.of("3.1 string", "3.2 string", "3.3 string");
//        example4.add("4 string");             // добавлять ячейки нельзя
//        example3.set(0, "new 3.1 string");    // элементы изменять !!!нельзя!!!
        for (String str: example3) {
            System.out.println(str);
        }

        System.out.println("\n_________________________________________");
        List<String> example4 = Arrays.asList("4.1 string", "4.2 string", "4.3 string");
//        example4.add("4 string");             // добавлять ячейки нельзя
        example4.set(0, "new 4.1 string");      // элементы изменять !!!можно!!!
        for (String str: example4) {
            System.out.println(str);
        }
    }
//
//    @Override
//    public int compareTo(String o) {
//        return 0;
//    }
}
