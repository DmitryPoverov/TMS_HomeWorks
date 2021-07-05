package HW.HW11.Task3_3_5_Palindromes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Running {
    public static void main(String[] args) {

        String i;
        String text;
        StringBuilder text1 = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("TestText.txt"))) {
            while ((i = br.readLine()) != null) {
                    text1.append(i + '\n');
            }
            text = text1.toString();

            text = text.replaceAll("\r\n", " ");
            text = text.replace(".", ". ");
            text = text.replaceAll("\\s+", " ");

            String[] textParts;

            textParts = text.split("\\. ");

            for (String s : textParts) {
                if (TextFormatter.isPalindrome(s)) {
                    try (FileWriter fr = new FileWriter("TestText2.txt", true)) {
                        fr.write(s + ".\n");
                    }
                } else if (TextFormatter.WordCounter(s) >=3 && TextFormatter.WordCounter(s)<=5) {
                    try (FileWriter fr = new FileWriter("TestText2.txt", true)) {
                        fr.write(s + ".\n");
                    }
                }
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
