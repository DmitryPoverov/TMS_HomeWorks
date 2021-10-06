package dmLessons.practice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 *
 * Работаем через Path.of и задаем ему весь путь до файла, а затем этот путь отдаем сканеру.
 * Хотя сканер не поток, его все равно нужно закрывать (для этого используем try with resources).
 * Через hasNext() узнаем есть ли дальше слова, а через next() получаем следующую строку.
 * У константы вызываем метод, возвращающий номер позиции, введенной буквы или -1, если такой буквы в константе нет.
 */

public class Task1 {

    private static final String VOWEL = "аяоёэеыиуюАЯОЁЭЕЫИУЮeyuioaEYUIOA";

    public static void main(String[] args) throws IOException {

        int counter = 0;

        Path path = Path.of("src", "dmLessons", "resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstSymbol = word.charAt(0);
                if (VOWEL.indexOf(firstSymbol) != -1) {
                    counter++;
                    System.out.print(word + (counter%10==0? "\n" : " "));
                }
            }
            System.out.print("\nThe total amount: " + counter + (counter==1? " word" : " words"));
        }
    }
}
