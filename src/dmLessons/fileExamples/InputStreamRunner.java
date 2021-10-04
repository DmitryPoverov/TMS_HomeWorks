package dmLessons.fileExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {

        // Безопасный (для разных ОС) способ создания пути.
        // var file = new File(String.join(File.separator, "src", "dmLessons", "resources", "test2.txt"));

        // Современный способ создания пути через экземпляр класса Path.
        File file = Path.of("src", "dmLessons", "resources", "test.txt").toFile();

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[fileInputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) fileInputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String value = new String(bytes);
            System.out.println(value);

//            byte[] bytes = fileInputStream.readAllBytes();
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);
        }

// Простой для меня вариант создания сначала пути, потом экземпляра по этому пути.
//        var path = Path.of("src", "dmLessons", "resources", "test.txt").toString();
//        File file = new File(path);
//
//        try (var fileInputStream = new FileInputStream(file)) {
//            byte[] bytes = fileInputStream.readAllBytes();
//            var stringValue = new String(bytes);
//            System.out.println(stringValue);
//        }


    }
}
