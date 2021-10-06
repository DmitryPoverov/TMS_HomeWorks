package dmLessons.practice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 2. Задан файл с текстом, найти и вывести в консоль все слова, для
 * которых последняя буква одного слова совпадает с первой буквой
 * следующего слова
 *
 * Пишем через Path.of() и Scanner.
 * Сначала через if (если есть следующее) заполняем предыдущее число. Если следующего нет - далее весь код не работает.
 * Потом в цикле while (пока есть следующее) предыдущее и текущее слова отправляем в метод.
 * В методе сравниваем предыдущего последнюю букву (length-1) и текущего первую букву (0). Возвращаем boolean.
 * Если метод вернул true, то выводим предыдущее и следующее слова.
 * В конце каждого круга while preview = current, чтобы следующее слово стало предыдущим, а проверка повторилась.
 */

public class Task2 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("src", "dmLessons", "resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            String preview = null;
            if (scanner.hasNext()) {
                preview = scanner.next();
            }
            while (scanner.hasNext()) {
                String current = scanner.next();
                if (isEqualLastAndFirst(preview, current)) {
                    System.out.println(preview + " " + current);
                }
                preview = current;
            }
        }
    }

    private static boolean isEqualLastAndFirst(String preview, String current) {
        return preview.charAt(preview.length()-1) == current.charAt(0);
    }
}
