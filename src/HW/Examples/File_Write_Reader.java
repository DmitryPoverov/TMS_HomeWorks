package HW.Examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Write_Reader {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Test string 2 ");

        try (FileWriter fr = new FileWriter("TestFile.txt", true)) {

            fr.write(sb.toString());
        }
        catch (IOException iOE) {
            System.out.println(iOE.getMessage());
        }

        sb = new StringBuilder();

        try (FileReader fr = new FileReader("TestFile.txt")) {
            int i;

            while ((i = fr.read()) != -1) {
                sb.append((char) i);
            }
            System.out.println(sb);
        }
        catch (IOException iOE) {
            System.out.println(iOE.getMessage());
        }
    }
}