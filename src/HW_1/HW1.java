//1) Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//затем в столбик (отделяя один элемент от другого началом новой строки).
//Передсозданием массива подумайте, какого он будет размера.

package HW_1;

public class HW1 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        /*int temp = 2;

        for (int i=0; i<arr.length; i++) {
            arr[i] = temp;
            temp+=2;
        }*/

        for (int i = 2, j=0; i <= 20 && j<arr.length; i++) {
            if (i%2 == 0) {
                arr [j] = i;
                j++;
            }
        }

        for (int X: arr) {
            System.out.println(X);
        }
    }
}
