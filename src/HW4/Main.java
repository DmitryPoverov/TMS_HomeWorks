package HW4;

public class Main {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;
        int num3 = -1;
        int counter = 0;

        if (num1>0) {
            counter++;
        }
        if (num2>0) {
            counter++;
        }
        if (num3>0) {
            counter++;
        }
        System.out.println("Number of positive numbers: " + counter);
    }
}