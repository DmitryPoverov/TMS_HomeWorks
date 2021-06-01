//10) Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
//переменную n. Если пользователь ввёл не подходящее число, то программа
//должна выдать соответствующее сообщение. Создать массив из n случайных
//целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
//только из чётных элементов первого массива, если они там есть, и вывести его
//на экран.

package HW_10;
import java.util.Random;
import java.util.Scanner;
public class HW10 {
    public static void main(String[] args) {

        int n;
        int evenCount = 0;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter a number more than 3: ");

        n = sc.nextInt();

        while (n<4) {
            System.out.println("You've entered a wrong number");
            System.out.print("Reenter it: ");
            n = sc.nextInt();
        }

        int[] arr1 = new int[n];

        for (int i=0; i<arr1.length; i++) {
            arr1[i] = rand.nextInt(n);
            System.out.print(arr1[i] + " ");
            if (arr1[i]%2 == 0 && arr1[i]!=0) {
                evenCount++;
            }
        }

        System.out.println("\nIn the array even " + ((evenCount>1)? "numbers are " : "number is ") + evenCount);

        int[] arr2 = new int [evenCount];

        for (int i=0, j=0; i<arr1.length; i++) {
            if (arr1[i]%2 == 0 && arr1[i]!=0) {
                arr2[j] = arr1[i];
                j++;
            }
        }

        for (int x: arr2) {
            System.out.print(x + " ");
        }
    }
}
