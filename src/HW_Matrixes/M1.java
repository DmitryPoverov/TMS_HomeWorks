//1) Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
//случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
//матрицы).

//1.1) Почитать сумму четных элементов стоящих на главной диагонали.
//1.2) Вывести нечетные элементы находящиеся под главной диагональю(включительно).
//1.3) Проверить произведение элементов какой диагонали больше.
//1.4) Посчитать сумму четных элементов стоящих над побочной диагональю (невключительно)
//1.5) Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)

package HW_Matrixes;
import java.util.Random;
import java.util.Scanner;
public class M1 {

    public static void main(String[] args) {

        int userChoice;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Enter size of the table: ");
        userChoice = sc.nextInt();
        int[][] arr = new int[userChoice][userChoice];

//------------------1-----(The first solving of 1)-------------------------

//        for (int i=0; i<arr.length; i++) {
//            for (int j=0; j<arr[i].length; j++) {
//                arr[i][j] = rnd.nextInt(51);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//------------------1-----(The second solving of 1)------------------------

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(5);
            }
        }

        for (int[] i: arr) {
            for (int j: i) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }

//------------------1.1----------------------------------------------------

        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i][i]%2==0) {
                sum+=arr[i][i];
            }
        }
        System.out.println("\n1.1) The sum of all even numbers of the main diagonal is: " + sum);

//------------------1.2----------------------------------------------------

        System.out.println("\n1.2) All odd numbers are under main diagonal (inclusive):");
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<=i; j++) {
                if (arr[i][j]%2!=0) {
                    System.out.printf("%3d", arr[i][j]);
                }
            }
        }

//------------------1.3----------------------------------------------------

        int downSide = 1;
        int upSide = 1;

        for (int i=0; i<arr.length; i++) {
            downSide*=arr[i][i];
        }

        for (int i=0; i<arr.length; i++) {
            upSide*=arr[i][arr.length-1-i];
        }

        System.out.println("\n\n1.3) The product of the main diagonal is: " + downSide);
        System.out.println("The product of the side diagonal is: " + upSide);

        if (downSide>upSide) {
            System.out.println("The main diagonal is more");
        } else if (downSide<upSide) {
            System.out.println("The side diagonal is more");
        } else {
            System.out.println("The products of the diagonals are equal");
        }

//------------------1.4----------------------------------------------------

        sum = 0;

        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr[i].length-1-i; j++) {
                if ((arr[i][j])%2==0) {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("\n1.4) The sum of all even numbers of the table is: " + sum);

//------------------1.5----------------------------------------------------

        int[][] arrTrans = new int [userChoice][userChoice];

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arrTrans[j][i] = arr[i][j];
            }
        }

        System.out.println("\n1.5) The origin table\tThe transposed table");

        for (int i=0; i<arr.length; i++) {
            System.out.print("\t");
            for (int j=0; j<arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.print("\t\t\t");
            for (int j=0; j<arr[i].length; j++) {
                System.out.printf("%3d", arrTrans[i][j]);
            }
            System.out.println();
        }
    }
}
