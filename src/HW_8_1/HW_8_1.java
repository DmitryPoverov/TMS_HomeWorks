package HW_8_1;

public class HW_8_1 {

    public static void main(String[] args) {

        int start = 9;
        int space = 1;
        int floor = start/2;

        for (int i=floor; i>1; i--) {
            for (int k=0; k<=space; k++) {
                System.out.print("*");
            }
            System.out.println();

            /*for (int l) {
                System.out.print("*");
            }*/
        }
    }
}
