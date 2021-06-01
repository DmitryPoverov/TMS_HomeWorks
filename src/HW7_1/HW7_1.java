package HW7_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW7_1 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int numProgram;

        do {
            System.out.print("\nEnter the number of programmers: ");

            try {
                numProgram = sc.nextInt();

                System.out.print("Работает " + numProgram);

                int num1 = numProgram%10;
                int num2 = numProgram%100;

                if ((numProgram >= 5) && (numProgram <= 20)) {          // 5 - 20
                    System.out.println(" программистов.");
                } else if ((numProgram >= 2) && (numProgram <= 4)) {    // 2 - 4
                    System.out.println(" программиста.");
                } else if ((num2 >=11) && (num2 <= 13)) {               // *11 - *13
                    System.out.println(" программистов.");
                } else if ((num1 == 1) ||(numProgram == 1)) {           // 1, *1, **1 ...
                    System.out.println(" программист.");
                } else if ((num1 >= 2) && (num1 <= 4)) {                // *2 - *4, **2 - **4 ...
                    System.out.println(" программиста.");
                } else {                                                // *5 - *9, **5 - **9 ...
                    System.out.println(" программистов.");
                }
            }
            catch (InputMismatchException exc) {
                System.out.println("Entered a symbol, not a number! Program is ending.");
                numProgram = -1;
            }
        } while (numProgram != -1);
    }
}