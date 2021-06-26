package HW.HW_Examples;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Examples {
    public static void main(String[] args) {

        Set<String> example1 = new HashSet<>();
        example1.add("String 2");
        example1.add("String 1");
        example1.add("String A");

        Set<String> example2 = new HashSet<>();
        example2.add("String 2.3");
        example2.add("String 2");
        example2.add("String 1");
        example2.add("String F");
        example2.add("String A");

        for (String str: example1) {
            System.out.println(str);
        }

        boolean b1 = example1.addAll(example2);
        System.out.println("\n" + b1 + "\n");

        for (String str: example1) {
            System.out.println(str);
        }

        example2.clear();
        b1 = example2.isEmpty();
        System.out.println("\nThe example2 is empty: " + b1 + "\n");

        b1 = example2.contains("String 1");
        System.out.println("DO the example2 has \"String 1\": " + b1 + "\n");

        b1 = example1.remove("String 1");
        System.out.println("Was \"String 1\" deleted from example1: " + b1 + "\n");

        for (String str: example1) {
            System.out.println(str);
        }

        System.out.println("\n" + "Example1 size: " + example1.size());
        System.out.println("Example2 size: " + example2.size() + "\n");

        Object[] example3 = example1.toArray();

        for (Object str: example3) {
            System.out.println(str);
        }

        b1 = example1.add("String 2");
        System.out.println("\nWas \"String 2\" added to example1: " + b1);

    }
}
