package CW;

import java.io.*;
import java.util.Scanner;



public class BufferedReader_Scanner {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(new BufferedReader(new FileReader("TestText1.txt")));
             BufferedWriter bWriter = new BufferedWriter(new FileWriter("TestText2.txt"))) {

            int i;

            while ((i = scan.nextInt()) != -1) {
                System.out.println((char) i);
                bWriter.write(i);
            }

        } catch (FileNotFoundException exc1) {
            System.out.println("1 " + exc1);
        } catch (IOException exc2) {
            System.out.println("2 " + exc2);
        }
    }
}
