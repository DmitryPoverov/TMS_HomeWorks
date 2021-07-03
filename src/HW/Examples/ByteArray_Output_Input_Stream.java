package HW.Examples;

import java.io.*;

public class ByteArray_Output_Input_Stream {
    public static void main(String[] args) {

        ByteArrayOutputStream bAOS = new ByteArrayOutputStream(); // его цель: записать из себя байтовый массив

        byte[] bArray1 = "Test string 3 ".getBytes();

        try {
            bAOS.write(bArray1);    // т.е. он в себя записывает
        }
        catch (IOException iOE) {
            System.out.println(iOE.getMessage());
        }

        try (FileOutputStream fOS = new FileOutputStream("TestFile.txt", true)) {
            bAOS.writeTo(fOS);
        }
        catch (IOException iOE) {
            System.out.println(iOE.getMessage());
        }
        System.out.println(bAOS);

System.out.println("\n-----------------------------------------------------------------------------------------");



        ByteArrayInputStream bAIS = new ByteArrayInputStream(bArray1); // его цель: поместить в себя байтовый массив.

        int b;
        while((b = bAIS.read())!=-1){   // использую метод write(), читаем из него.
            System.out.print((char)b);
        }

System.out.println("\n-----------------------------------------------------------------------------------------");

        ByteArrayInputStream bAIS2 = new ByteArrayInputStream(bArray1, 1, 2);
                                                           // откуда,  с позиции, сколько
        int c;
        while((c = bAIS2.read())!=-1){
            System.out.print((char)c);
        }
    }
}