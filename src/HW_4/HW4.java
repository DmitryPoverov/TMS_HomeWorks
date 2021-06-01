//4) Создайте массив из 20 случайных целых чисел из отрезка [0;20].
//Выведитемассив на экран в строку. Замените каждый элемент с нечётным
//индексом наноль. Снова выведете массив на экран на отдельной строке.

package HW_4;

import java.util.Random;

public class HW4 {
    public static void main(String[] args) {

        int[] arr = new int[20];

        Random randNum = new Random();

        for (int i=0; i<arr.length; i++) {
            arr[i] = randNum.nextInt(20);
        }

        for (int x: arr) {
            System.out.print(x + " ");
        }

        for (int i=0; i<arr.length; i++) {
            if (i%2==1) {
                arr[i]=0;
            }
        }

        System.out.println();

        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
}
