package CW;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderCW {

    public static void main(String[] args) {

        try (InputStreamReader iSReader = new InputStreamReader(System.in)) {

            System.out.print("Enter 1 or 2: ");

            char c;

            if ((char)iSReader.read() == '1') {

                System.out.print("1) Enter symbols and press \"Enter\". Symbol @ to escape program: ");

                while ((c = (char) iSReader.read()) != '@') { // сначала проверка, потом выполнение
                    System.out.print(c);
                }
            }
            else {

                System.out.print("2) Enter any symbols and press \"Enter\". Symbol @ to escape program: ");

                do {                                          // сначала выполнение, потом проверка
                    c = (char) iSReader.read();
                    System.out.print(c);

                } while (c != '@');
            }
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
