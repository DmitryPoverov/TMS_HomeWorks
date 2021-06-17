package CW.Task1;

public class Running {

    public static void main(String[] args) {

        int a = 0;
        int b = 48;
        int c;

        try {
            c = b/a;
            System.exit(0);
        } catch (ArithmeticException exc) {
            a = 7;
        } finally {
            System.out.println("Finally!");
            System.out.println(c = b/a);
        }
    }
}
