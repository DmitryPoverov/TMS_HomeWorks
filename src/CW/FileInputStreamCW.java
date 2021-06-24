package CW;

import java.io.*;




public class FileInputStreamCW {
    public static void main(String[] args) {

        try (FileInputStream fIStream = new FileInputStream("ImageTest1.bmp");
             FileOutputStream fWriter = new FileOutputStream("ImageTest2.bmp", false)) {

            int i;

            while ((i = fIStream.read()) != -1) {
                System.out.print(i);
                fWriter.write(i);
            }

        } catch (FileNotFoundException e1) {
            System.out.println(e1);
        } catch (IOException e2) {
            System.out.println(e2);
        }
    }
}

