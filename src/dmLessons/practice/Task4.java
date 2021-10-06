package dmLessons.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4. Задан файл с java-кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */

public class Task4 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("src", "dmLessons", "fileExamples", "WriterRunnerTestForTask4.java");
        String stringValue = Files.readString(path);

        String result = stringValue.replace("public", "private");

        Path resultPath = Path.of("src", "dmLessons", "resources", "WriterRunnerTestForTask4.txt");
        Files.writeString(resultPath, result);
    }
}
