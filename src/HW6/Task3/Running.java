package HW6.Task3;

import java.util.Scanner;

public class Running {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (from 0 to 20) and press 'Enter'");
        int choice1 = sc.nextInt();
        System.out.printf("Enter a number (from %d to %d) and press 'Enter'\n", choice1+2, choice1+20);
        int choice2 = sc.nextInt();

        System.out.printf("First number: %d,\nSecond number: %d.\n", choice1, choice2);

        TwoNumbers tn = new TwoNumbers(choice1, choice2);

        tn.numArray();

        System.out.println();

        TwoNumbers2 tn2 = new TwoNumbers2(choice1, choice2);    // работает только, если a<b

        tn2.numArray2();                                        // если a>b, то выдаст ошибку переполнения стека
    }
}
