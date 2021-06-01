package HW_Additional_Tasks;
import java.util.Random;
import java.util.Scanner;
public class Add1 {

    public static void main(String[] args) {

        int userChoice;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        userChoice = sc.nextInt();

        int[] arr1 = new int[userChoice];

        for (int i=0; i<arr1.length; i++) {
            arr1[i] = rnd.nextInt(110);
            System.out.print(arr1[i] + " ");
        }

//1) Найти произведение элементов, кратных 3.

        int sum3num = 1;

        for (int i: arr1) {
            if (i%3==0 && i!=0) {
                sum3num*=i;
            }
        }

        System.out.println("\n\n1) Here is the product all numbers divisible to 3: " + sum3num + "\n");

//2) Найти среднее арифметическое элементов с нечетными номерами.

        double counter = 0;
        double sum = 0;

        for (int i=0; i< arr1.length; i++) {
            if (i%2==1) {
                sum+=arr1[i];
                counter++;
            }
        }

        if (counter==0) {
            System.out.println("2) There are no odd number numbers in the array");
        } else {
            double sA = sum/counter;
            System.out.println("2) A simple average of numbers with odd numbers is: " + sA);
        }

//3) Найти средне арифметическое элементов массива, превосходящих некоторое число С.

        sum = 0;
        counter = 0;
        int numberC;

        System.out.print("\n3) Enter a number (for comparing and finding a simple average): ");

        numberC = sc.nextInt();

        for (double i: arr1) {
            if (i>numberC) {
                sum+=i;
                counter++;
            }
        }

        if (counter==0) {
            System.out.println("There are no numbers more than " + numberC);
        } else {
            double sA = sum/counter;
            System.out.println("A simple average of numbers more than " + numberC + " is: " + sA);
        }

//4) Найти наименьший нечетный элемент.

        int smallest = arr1[0];
        boolean change = false;

        for (int i=1; i<arr1.length; i++) {
            if (i%2==1 && arr1[i]<smallest) {
                smallest = arr1[i];
                change = true;
            }
        }

        if (change) {
            System.out.println("\n4) The smallest odd element is " + smallest);
        } else {
            System.out.println("\n4) There are no odd numbers");
        }

//5) «Сожмите» массив, выбросив из него каждый второй элемент. «Освободившиеся» места массива заполните нулями.

        System.out.println("\n5) The changed array:");

        for (int i=0; i<arr1.length; i++) {
            if (i%2==1) {
                arr1[i] = 0;
            }
            System.out.print(arr1[i] + " ");
        }

        for (int i=0; i<arr1.length-1; i++) {
            int j=i+1;
            if (arr1[i]==0 && j<arr1.length-1) {
                while (arr1[j]==0) {
                    j++;
                    if (j==arr1.length-1) {
                        break;
                    }
                }
                arr1[i]=arr1[j];
                arr1[j]=0;
            }
        }

        System.out.println("\nThe moved array: ");

        for (int i: arr1) {
            System.out.print(i + " ");
        }

//6) Проверить, различны ли все элементы массива.

        int same = 0;
        int temp;

        for (int i: arr1) {
            temp = i;
            for (int l: arr1) {
                if (l == temp) {
                    same++;
                }
            }
        }

        if (arr1.length==Math.sqrt(same)) {
            System.out.println("\n\n6) Elements of the array are the same.");
        } else {
            System.out.println("\n\n6) Elements of the array are not the same.");
        }

//7) Подсчитать, сколько раз встречается элемент с заданным значением.

        for (int i=0; i<arr1.length; i++) {
            arr1[i] = rnd.nextInt(110);
        }

        System.out.println("\n7) The new array:");

        for (int i: arr1) {
            System.out.print(i + " ");
        }

        System.out.print("\nEnter number from 0 to 10 you want to count: ");

        userChoice = sc.nextInt();
        counter = 0;

        for (int i: arr1) {
            if (i==userChoice) {
                counter++;
            }
        }

        System.out.print("The number " + userChoice + " occurs " + (int)counter);
        System.out.println(counter>1? " times" : " time");


//7.1) Подсчитать, сколько раз каждый эмемент массива встречается в этом массиве.
//
//        int[] arr2 = new int [arr1.length];
//
//        for (int i: arr1) {
//            for (int j=0; j<arr1.length; j++) {
//                if ()
//            }
//        }

//8) Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.

        int biggest = 0;
        int biggest2 = 0;

        for (int i: arr1) {
            if (i>biggest) {
                biggest=i;
            }
        }

        for (int i: arr1) {
            if (i!=biggest && i>biggest2) {
                biggest2=i;
            }
        }

        System.out.println("\n8) The biggest number is: " + biggest);
        System.out.println("The second biggest number (second from the end) is: " + biggest2);

//9) Найти наименьший элемент среди элементов с четными индексами массива.

        smallest=arr1[0];

        for (int i=1; i<arr1.length; i++) {
            if (i%2==0 && arr1[i]<smallest) {
                smallest=arr1[i];
            }
        }

        System.out.println("\n9) The smallest element with an even number is : " + smallest);

//10) Найти максимальный элемент в массиве и поменять его местами с нулевым элементом.

        int biggestNum = -1;
        biggest = -1;

        for (int i=0; i<arr1.length; i++) {
            if (arr1[i]>biggest) {
                biggest=arr1[i];
                biggestNum=i;
            }
        }

        System.out.println("\n10) The biggest element is " + biggest + ", its number is " + biggestNum);
        System.out.println("The 0 number element is " + arr1[0]);

        temp = arr1[0];
        arr1[0] = biggest;
        arr1[biggestNum] = temp;

        System.out.println("The new 0 number element is " + arr1[0]);
        System.out.println("The new " + biggestNum + " number element is " + arr1[biggestNum]);

        for (int i: arr1) {
            System.out.print(i + " ");
        }

    }
}
