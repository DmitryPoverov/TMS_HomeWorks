package HW7;

public class HW7 {

    public static void main (String[] args) {

        int numProgram = 10;

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
}