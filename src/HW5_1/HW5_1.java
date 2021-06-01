package HW5_1;

import java.util.Scanner;

public class HW5_1 {

    public static void main(String[] args) {

        int counter = 0;
        int counterPos = 0;
        int counterNeg = 0;

        int [] arr2 = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i< arr2.length; i++) {
            System.out.print("Insert number #" + (i+1) + ": ");
            arr2[i]=sc.nextInt();
        }

        for (int X: arr2) {
            System.out.print(X + " ");
            if (X>0) {
                counterPos++;
            } else if (X<0) {
                counterNeg++;
            }

            if ((X>0) || (X<0)) {
                counter++;
            }
        }

        System.out.println("\nTotal amount of positive and negative numbers is: " + counter);
        System.out.println("Total amount of positive numbers is: " + counterPos);
        System.out.println("Total amount of negative numbers is: " + counterNeg);
    }
}