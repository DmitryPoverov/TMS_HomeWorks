package dmLessons.fileExamples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class WriterRunner {
    public static void main(String[] args) throws IOException {

        File file = Path.of("src", "dmLessons", "resources", "test.poem").toFile();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
            fileWriter.append("A test string 1.");
            fileWriter.newLine();
            fileWriter.append("A test string 2.");
            fileWriter.newLine();
        }
    }
}
