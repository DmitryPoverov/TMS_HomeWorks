//3) Создайте массив из 15 случайных целых чисел из отрезка [0; 99].
//Выведитемассив на экран. Подсчитайте сколько в массиве чётных элементов
//и выведетеэто количество на экран на отдельной строке.

package HW_3;
import java.util.Random;
public class HW3 {

    public static void main(String[] args) {

        int[] arr = new int[15];

        Random random = new Random();

        for (int i=0; i<15; i++) {
            arr[i]=random.nextInt(99);
        }

        for (int X: arr) {
            System.out.print(X + " ");
        }

        int evenNum=0;

        for (int X: arr) {
            if (X%2 == 0 && X!=0) {
                evenNum++;
            }
        }
        System.out.println("\nIn the current array are: " + evenNum + " even numbers.");
    }
}
