package dmLesson.Collections;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample {
    public static void main(String[] args) {

//        var integers = Arrays.asList(12, 324, 53454, 453, 345);
        var strings = Arrays.asList("we", "you", "as", "they");
        Collections.sort(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
