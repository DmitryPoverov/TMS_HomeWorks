package CW;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderCW {

    public static void main(String[] args) {

        try (InputStreamReader iSReader = new InputStreamReader(System.in)) {

            System.out.print("Enter symbols. Symbol @ to escape program: ");

            char c;

            while ((c = (char) iSReader.read()) != '@') {
                System.out.print(c);
            }
//
//            do {
//                c = (char) iSReader.read();
//                System.out.print(c);
//            } while (c != '@');
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
