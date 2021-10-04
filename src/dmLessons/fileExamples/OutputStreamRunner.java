package dmLessons.fileExamples;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class OutputStreamRunner {
    public static void main(String[] args) throws IOException {

        File file = Path.of("src", "dmLessons", "resources", "test.txt").toFile();

        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String value = "A test string";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
