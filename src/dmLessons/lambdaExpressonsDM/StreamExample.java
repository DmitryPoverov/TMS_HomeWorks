package dmLessons.lambdaExpressonsDM;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");

// Старый подход на работы с коллекцией.
        for (String s: strings) {
            String v = s + s;
            Integer intValue = Integer.valueOf(v);
            if (intValue%2 == 0) {
                System.out.println(intValue);
            }
        }

        System.out.println("---------------------------------------------------------------------------");

// преобразование коллекции в стрим (.stream())
        var intSummaryStatistics = strings
                .stream()
                .map((value) -> value + value)      // Один параметр поэтому скобки не обязательны
                .map(Integer::valueOf)              // value -> Integer.valueOf(value)
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                //.max()                            // Optional<T> max(Comparator<? super T> comp) т.к. не примитивный.
                .mapToInt(Integer::intValue)        // (value -> value.intValue()) // извлекаем int из текущего String.
                //.max()                            // OptionalInt max(); компаратор не нужен т.к. примитивный.
                //.min()
                //.sum()
                //.forEach(System.out::println);    // value -> System.out.println(value)
                //.mapToObj(Integer::valueOf)       // (intValue -> Integer.valueOf(intValue)) назад в ссылочный тип.
                .summaryStatistics();               // выводит переменную содержащую в себе суммарную статистику.
        System.out.println(intSummaryStatistics);

        System.out.println("---------------------------------------------------------------------------");

        Stream.of("1", "2", "3", "4")
                .peek(value -> System.out.print(value + " "))
                .map(value -> value + value)
                .collect(Collectors.toList())
                .forEach(value -> {
                    System.out.println();
                    System.out.print(value + " ");
                });
    }
}
