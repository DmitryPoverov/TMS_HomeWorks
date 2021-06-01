package HW_9;

public class HW_9 {

    public static void main(String[] args) {

        System.out.println("\nA table of multiplying");
        for (int i=1; i<10; i++) {
            for (int j=1; j<10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }

        System.out.println("A Pythagoras' table");
        for (int i=1; i<10; i++) {
            for (int j=1; j<10; j++) {
                System.out.printf("%3d ", j*i);
            }
            System.out.println();
        }
    }
}