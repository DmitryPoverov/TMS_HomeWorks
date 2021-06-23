package CW.Task1;

import java.io.*;




public class BufferedReaderCW {
    public static void main(String[] args) {

        try (BufferedReader fileIn = new BufferedReader(new FileReader("TestText.txt"));
             BufferedWriter fileOut = new BufferedWriter(new FileWriter("TestText.txt", true))) {

            int i;

            while ((i = fileIn.read()) != -1) {
                System.out.print((char) i);
                fileOut.write(i);
            }

        } catch (FileNotFoundException exc1) {
            System.out.println(exc1);
        } catch (IOException exc2) {
            System.out.println(exc2);
        }

        try (BufferedReader fileIn = new BufferedReader(new FileReader("TestText.txt"));
             BufferedWriter fileOut = new BufferedWriter(new FileWriter("TestText.txt", true))) {

            String s = "";

            while ((s = fileIn.readLine()) != null) {
                System.out.println(s);
                fileOut.write(s + "\n");
            }

        } catch (FileNotFoundException exc1) {
            System.out.println(exc1);
        } catch (IOException exc2) {
            System.out.println(exc2);
        }
    }
}