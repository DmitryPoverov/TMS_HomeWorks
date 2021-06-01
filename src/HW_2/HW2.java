//2) Создайте массив из всех нечётных чисел от 1 до 99, выведите его на
//экран встроку, а затем этот же массив выведите на экран тоже в строку,
//но в обратномпорядке (99 97 95 93 … 7 5 3 1).

package HW_2;
public class HW2 {

    public static void main(String[] args) {

        int [] arr = new int[50];

//        int temp = 1;
//
//        for (int i=0; i < arr.length; i++) {
//            arr[i]=temp;
//            temp+=2;
//        }

        for (int i=0, j=0; i<50; j++) {
            if (j%2==1) {
                arr[i]=j;
                i++;
            }
        }

        for (int X: arr) {
            System.out.print(X + " ");
        }

        System.out.println();

        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
