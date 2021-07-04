package HW.HW11.SerializeAuto.Task3_Censorship;

import java.io.FileWriter;
import java.io.IOException;

public class Censor {

    private String text;

    public Censor(String text) {
        this.text = text;
    }

    public void wordFinder() {

        String foundWords = null;
        boolean switcher = false;

        text = text.replace(".", ". ");
        text = text.replaceAll("\\s+", " ");

        String[] splitText = text.split("\\. ");

        for (String s : splitText) {
            switcher = false;
            s = s.replaceAll("\\p{Punct}", "");
            s = s.replaceAll("\\s+", " ");

            char[] stringChar = s.toCharArray();
            for (char c : stringChar) {
                if ((int)c >= 65 && (int)c <=122) {
                    System.out.print(c);
                    switcher = true;
                }
            }
            if (switcher) {
                System.out.println("\t<- Problem. In ->\t" + s);
                try (FileWriter fw = new FileWriter("TestText2.txt", true)) {
                    fw.write(s + ".\n");
                }
                catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }
            }
        }
        if (!switcher) {
            System.out.println("The problems were not found.");
        }
    }
}
