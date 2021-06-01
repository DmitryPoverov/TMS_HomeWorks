//8) Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//массива должен равняться отношению элемента из первого массива с i-ым
//индексом к элементу из второго массива с i-ым индексом. Вывести все три
//массива на экран (каждый на отдельной строке), затем вывести количество
//целых элементов в третьем массиве.

package HW_8;

import java.util.Random;

public class HW8 {
    public static void main(String[] args) {

        int [] arr1 = new int [10];
        int [] arr2 = new int [10];
        double [] arr3 = new double [10];
        Random randNum = new Random();

        for (int i=0; i<10; i++) {
            arr1[i] = randNum.nextInt(9);
            arr2[i] = randNum.nextInt(9);
            if (arr2[i] == 0) {
                arr3[i] = 0;
            } else {
                arr3[i] = (double) arr1[i] / (double) arr2[i];
            }
        }

        System.out.println("The first array:");
        for (int x: arr1) {
            System.out.print(x + " ");
        }

        System.out.println("\nThe second array:");
        for (int x: arr2) {
            System.out.print(x + " ");
        }

        System.out.println("\nThe third array:");
        for (double x: arr3) {
            System.out.print(x + " ");
        }

        System.out.println("\nInteger numbers in arr3 array: ");
        for (double x: arr3) {
            if (x - ((int)x) == 0) {
                System.out.print(x + "\t\t");
            }
        }
    }
}