package CW.BufferedReader_Palindrome;

import java.io.*;
import java.util.Scanner;



public class Palindrome {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(new BufferedReader(new FileReader("TestText1.txt")));
         BufferedWriter bWriter = new BufferedWriter(new FileWriter("TestText2.txt"))) {

            while (scan.hasNextLine()) {

                String tempLine = scan.nextLine();
                if (PalindromeCheck.isPalindrome(tempLine)) {
                    bWriter.write(tempLine + "\n");
                }
            }

        } catch (FileNotFoundException exc1) {
            System.out.println("1) " + exc1);
        } catch (IOException exc2) {
            System.out.println("2) " + exc2);
        }
    }
}
