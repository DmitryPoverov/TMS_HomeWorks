package HW.HW9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Running {
    public static void main(String[] args) {

        String str = "Level rotor reviver \n street radar \n  \n   delivery.";

        System.out.println(str.substring(str.indexOf('e'), str.lastIndexOf('s')));

        System.out.println(str.replace(str.charAt(3), str.charAt(0)));

        str = str.replaceAll("\\s+", " ");

        String[] splitString= str.split(" ");

        for (String s : splitString ) {
            try(FileWriter fw = new FileWriter("TestFile.txt", true)) {
                if (isPalindrome(s)) {
                    fw.write(s);
                    fw.write('\n');
                }
            }
            catch (IOException iOE) {
                System.out.println(iOE.getMessage());
            }
        }

        String str1 = "";

        try (BufferedReader br = new BufferedReader(new FileReader("TestText.txt"))) {
            str1 = br.readLine();
        }
        catch (IOException iOE) {
            System.out.println(iOE.getMessage());
        }

        System.out.println(str1);

        str1 = str1.replace('\n', ' ');
        str1 = str1.replace(".", ". ");
        str1 = str1.replaceAll("\\s+", " ");

        System.out.println(str1);

        String[] strArray = str1.split("\\. ");
//
//        System.out.println("##########################");
//
//        for (String tempS : strArray) {
//            System.out.println(tempS);
//        }
//
//        System.out.println("##########################");
        for (String s : strArray) {
            if (isFits(s)) {
                try (FileWriter fw = new FileWriter("TestText2.txt", true)) {
                    fw.write(s);
                    fw.write(".\n");
                }
                catch (IOException iOE) {
                    System.out.println(iOE.getMessage());
                }
            }
        }
    }

    private static boolean isPalindrome(String str) {
        StringBuilder temp = new StringBuilder(str);
        return str.equalsIgnoreCase(temp.reverse().toString());
    }

    private static boolean isFits(String str) {

        StringBuilder temp;

        String[] strArray = str.split(" ");

        for (String s : strArray) {

            temp = new StringBuilder(s);

            char[] tempChar = s.toCharArray();

            if (s.equalsIgnoreCase(temp.reverse().toString())) {
                return true;
            } else if (tempChar.length == 5) {
                return true;
            }
        }
        return false;
    }
}
