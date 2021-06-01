//7) Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//какой элемент является в этом массиве максимальным и сообщите индекс его
//последнего вхождения в массив.

package HW_7;
import java.util.Random;
public class HW7 {
    public static void main(String[] args) {

        int[] arr = new int[12];
        int numIndex = 0;
        int numValue = 0;

        Random randNum = new Random();

        for (int i=0; i<arr.length; i++) {
            arr[i] = randNum.nextInt(15);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i< arr.length; i++) {
            if (numValue<arr[i]) {
                numValue = arr[i];
                numIndex = i;
            } if (numIndex==arr[i]) {
                numIndex = i;
            }
        }

        System.out.println("\nThe biggest number in the array is " + numValue + " its index is " + numIndex);

    }
}
