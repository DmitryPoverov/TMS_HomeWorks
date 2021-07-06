package CW.StreamAPI_Examples;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Running {
    public static void main(String[] args) {

        int[] arr1 = {-2, -1, -1, 0, 1, 1, 2, 2, 3};
        int[] arr2 = {};

        IntStream iStr = IntStream.of(arr1);
        long count = iStr.filter(v -> v > 0).count();
        System.out.println(count);


        IntStream iMaxNumber = IntStream.of(arr2);
        OptionalInt maxNum = iMaxNumber.max();
        if (maxNum.isPresent()) {
            System.out.println(maxNum.getAsInt());
        }
        System.out.println(maxNum.getAsInt());

        Stream st = Stream.of(new Object(), new Object());
//        st.map();

    }
}
