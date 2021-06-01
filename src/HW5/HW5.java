package HW5;

public class HW5 {

    public static void main(String[] args) {

        int num1 = -30;
        int num2 = -20;
        int num3 = -1;
        int counter = 0;

        if (num1 != 0) counter++;

        if (num2 != 0) counter++;

        if (num3 != 0) counter++;

        System.out.println("Total amount of positive and negative numbers: " + counter);
    }
}
