package CW;

import java.io.*;

public class InputStreamReader_2_CW {

    public static void main(String[] args) {

        try (InputStreamReader iSReader = new InputStreamReader(System.in);
             BufferedWriter bWriter = new BufferedWriter(new FileWriter("TestText2.txt", true))) {

            System.out.print("Enter symbols and press \"Enter\". Symbol @ to escape program: ");

            int i;
            StringBuilder s = new StringBuilder();

            while ((char)( i = iSReader.read()) != '@') {
                System.out.print((char) i);
                s.append((char)i);
            }

            System.out.println(s);
            bWriter.write("\n" + s);

        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
