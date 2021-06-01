//9) Пользователь должен указать с клавиатуры положительное число, а программа
//должна создать массив указанного размера из случайных целых чисел из [0;15] и
//вывести его на экран в строку. После этого программа должна определить и
//сообщить пользователю о том, сумма какой половины массива больше: левой или
//правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт
//неподходящее число, то выдать соответствующее сообщение.

package HW_9;
import java.util.Random;
import java.util.Scanner;
public class HW9 {

//    static boolean isCorrect (int number) {
//        if (number<=0 || number>10){
//            System.out.println("Your number is wrong");
//            return true;
//        } else {
//            System.out.println("Your number is correct");
//            return false;
//        }
//    }

    public static void main(String[] args) {

        int userChoice;
        int leftSum = 0;
        int rightSum = 0;

        Scanner sc = new Scanner(System.in);

        Random randNum = new Random();

        System.out.print("Enter a number from 1 to 10: ");

        userChoice = sc.nextInt();

//        if (userChoice<=0 || userChoice>11) {
//            System.out.print("Reenter a number from 1 to 10");
//            userChoice = sc.nextInt();
//        }

//        while (isCorrect(userChoice)) {
//            System.out.print("Enter a number from 1 to 10:");
//            userChoice = sc.nextInt();
//        }

        while (userChoice<=0 || userChoice>10) {
            System.out.println("Your number is wrong");
            System.out.print("Enter a number from 1 to 10: ");
            userChoice = sc.nextInt();
        }

        System.out.println("Your number is correct");

        int[] arr = new int[userChoice];

        for (int i=0; i< arr.length; i++) {
            arr[i] = randNum.nextInt(15);
            System.out.print(arr[i] + " ");
        }

        for (int i=0; i<arr.length/2; i++) {
            leftSum+=arr[i];
        }

        if (userChoice%2==0) {
            for (int i=arr.length-1; i>=arr.length/2; i--) {
                rightSum+=arr[i];
            }
        } else {
            for (int i=arr.length-1; i>=(arr.length+1)/2; i--) {
                rightSum+=arr[i];
            }
        }

        if (leftSum>rightSum) {
            System.out.print("\nThe left side of the array (" + leftSum);
            System.out.println (") is more than the right (" + rightSum +")");
        } else if (leftSum<rightSum) {
            System.out.print("\nThe left side of the array (" + leftSum );
            System.out.println(") is less than the right (" + rightSum + ")");
        } else {
            System.out.print("\nThe left side of the array (" + leftSum);
            System.out.println("equals to the right side(" + rightSum +")");
        }
    }
}