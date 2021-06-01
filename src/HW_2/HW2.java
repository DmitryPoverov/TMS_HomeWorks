package HW_2;

public class HW2 {

    public static void main (String[] arg) {

        int ameba = 1;
        int counter = ameba;

        for (int i=0; i<=24; i+=3) {
            ameba *= 2;
            System.out.printf("через %d часа %d \n", i+3, ameba );
        }
    }
}
