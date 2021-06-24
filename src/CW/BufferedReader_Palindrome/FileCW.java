package CW.BufferedReader_Palindrome;

import java.io.*;

public class FileCW {

    public static void main(String[] args) {

        File f = new File(".git");
        File[] sFiles = f.listFiles();

        for (File file: sFiles) {
            System.out.println("-> " + file.getAbsolutePath() + "\t<- " + file.getName());
        }

    }
}
