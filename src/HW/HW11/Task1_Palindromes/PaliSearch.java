package HW.HW11.Task1_Palindromes;

import java.io.FileWriter;
import java.io.IOException;

public class PaliSearch {

    public static void pSearch(String text) {

        StringBuilder sB = new StringBuilder(text);

        if(text.equalsIgnoreCase(sB.reverse().toString())) {
            try (FileWriter fw = new FileWriter("PaliWrite.txt", true)) {
                fw.write(text + "\n");
            }
            catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
