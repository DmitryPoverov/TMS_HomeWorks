package HW.HW11.Task3_Censorship;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Running {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();
        int i;

        try (BufferedReader br = new BufferedReader(new FileReader("TestFile.txt"))) {

            while ((i = br.read()) != -1) {
                text.append((char) i);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
//
//        System.out.println(text.toString());
//
        Censor checkingText = new Censor(text.toString());
        checkingText.wordFinder();

    }
}