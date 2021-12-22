package CW;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderCW {
    public static void main(String[] args) {

        try (FileReader fReader = new FileReader("TestText.txt");
             FileWriter fWriter = new FileWriter("src/CW/TestText.txt", true)) {

            int i;

            while ((i = fReader.read()) != -1) {
                System.out.print((char)i);
                fWriter.write(i);
            }

        } catch (FileNotFoundException e1) {
            System.out.println(e1);
        } catch (IOException e2) {
            System.out.println(e2);
        }
    }
}
