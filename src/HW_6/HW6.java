//6) Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//на экран в строку. Определить и вывести на экран сообщение о том, является ли
//массив строго возрастающей последовательностью.

package HW_6;

import java.util.Random;

public class HW6 {
    public static void main(String[] args) {

        boolean isGrowing = true;

        int[] arr = new int[4];

        Random randNum = new Random();

        for (int i=0; i<arr.length; i++) {
            arr[i] = randNum.nextInt(10);
            System.out.print(arr[i] + " ");
        }

        for (int i=0; i<arr.length-1; i++) {
            if ((arr[i]>arr[i+1]) || (arr[i]==arr[i+1])) {
                isGrowing = false;
            }
        }

        if (isGrowing) {
            System.out.print("\nThe array is a strictly increasing set\n");
        } else {
            System.out.print("\nThe array is not a strictly increasing set\n");
        }
    }
}
