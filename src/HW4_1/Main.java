package HW4_1;

/*import java.io.IOException;*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) /*throws IOException*/ {

        int counter = 0;

        /*byte [] arr1 = new byte[10];

        System.out.println("Insert 10 symbols without separators and press 'Enter'");

        System.in.read(arr1);

        System.out.println("You have inserted: ");

        for (byte x: arr1) {
            System.out.println(x);
        }*/

        int [] arr2 = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i< arr2.length; i++) {
            System.out.print("Insert number #" + (i+1) + ": ");
            arr2[i]=sc.nextInt();
        }

        for (int X: arr2) {
            System.out.print(X + " ");
            if (X>0) {
                counter++;
            }
        }

        System.out.println("\nTotal amount of positive numbers is: " + counter);
    }
}
