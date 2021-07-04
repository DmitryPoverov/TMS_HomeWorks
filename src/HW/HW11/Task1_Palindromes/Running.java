package HW.HW11.Task1_Palindromes;

import java.io.FileReader;
import java.io.IOException;

public class Running {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try (FileReader fr = new FileReader("PaliRead.txt")) {
            int i;

            while ((i = fr.read()) != -1) {
                if (i != '\r') {
                    sb.append((char)i);
                } else {
                    fr.read();  // Для Windows нужно пропустить слудующий символ, т.к. в ней перенос - это \r\n
                    PaliSearch.pSearch(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}