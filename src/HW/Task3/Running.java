package HW.Task3;

import java.util.Scanner;

public class Running {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers (between 0 and 20).\nEnter the first and press 'Enter': ");
        int choice1 = sc.nextInt();
        System.out.print("Enter the second and press 'Enter': ");
        int choice2 = sc.nextInt();

        System.out.printf("\nFirst number: %d\nSecond number: %d\n", choice1, choice2);

        TwoNumbers tn = new TwoNumbers(choice1, choice2);

        tn.numArray();
        System.out.println();

        TwoNumbers2 tn2 = new TwoNumbers2(choice1, choice2);    // работает только, если a<b
        tn2.numArray2();                                        // если a>b, то выдаст ошибку переполнения стека
    }
}
//        if ((a<b) && (a!=temp)) {
//        temp--;
//        numArray2();
//        System.out.print(temp++ + " ");
//
//        } else if ((a>b) && (a!=temp)) {
//        temp++;
//        numArray2();
//        System.out.print(temp-- + " ");
//
//        }  else if (a==b) {
//        System.out.println(a);
//        }