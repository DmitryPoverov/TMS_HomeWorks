//5) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//арифметическое элементов каждого массива и сообщите, для какого из
//массивов это значение оказалось больше (либо сообщите, что их средние
//арифметические равны).

package HW_5;
import java.util.Random;
public class HW5 {

    public static void main(String[] args) {

        int sum1 = 0;
        int sum2 = 0;

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        Random randNum = new Random();

        for (int i=0; i<5; i++) {
            arr1[i] = randNum.nextInt(15);
            arr2[i] = randNum.nextInt(15);
        }

        for (int x: arr1) {
            System.out.print(x + " ");
            sum1+=x;
        }

        System.out.println();

        for (int x: arr2) {
            System.out.print(x + " ");
            sum2+=x;
        }

        System.out.println();
        System.out.println("Total sum of all arr1 numbers equals to " + sum1);
        System.out.println("Total sum of all arr2 numbers equals to " + sum2);

        if (sum1>sum2) {
            System.out.println("sum1 is bigger than sum2");
        } else if (sum1<sum2) {
            System.out.println("sum1 is less than sum2");
        } else {
            System.out.println("sum1 equals sum2");
        }
    }
}
