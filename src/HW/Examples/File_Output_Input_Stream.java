package HW.Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Output_Input_Stream {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("String 1 ");

        try (FileOutputStream fos1 = new FileOutputStream
                ("C://Users//PD//IdeaProjects//TMS_HomeWorks//TestFile.txt", true)) {

            byte[] bBuffer = sb.toString().getBytes();
            fos1.write(bBuffer);
        } catch (IOException iOE) {
            System.out.println(iOE.getMessage());
        }

        sb = new StringBuilder();

        try(FileInputStream fis1 = new FileInputStream
                ("c://Users//PD//IdeaProjects//TMS_HomeWorks//TestFile.txt")) {
            int i;
            while ((i = fis1.read()) != -1) {
                sb.append((char) i);
            }
            System.out.println(sb);
        }
        catch (IOException iOE) {
            System.out.println(iOE.getMessage());
        }
    }
}