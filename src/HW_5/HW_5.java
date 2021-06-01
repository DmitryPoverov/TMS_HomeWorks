package HW_5;

public class HW_5 {

    public static void main(String[] args) {

        double inch = 2.54;

        for (int i = 1; i<=20; i++) {
            System.out.printf("%2d дюйм = %2.2f\n", i, i*inch);
        }
    }
}
