package HW6.Two_Numbers;

import java.util.Scanner;

public class Running {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number (from 0 to 20) dividing its by 'Space', then press 'Enter'");

        int choice1 = sc.nextInt();
        int choice2 = sc.nextInt();

        System.out.printf("Your first number: %d, second number: %d", choice1, choice2);

        TwoNumbers tn = new TwoNumbers();

        tn.numArray(choice1, choice2);
    }
}
