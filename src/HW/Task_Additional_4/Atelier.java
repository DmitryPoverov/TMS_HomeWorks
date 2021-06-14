package HW.Task_Additional_4;

public class Atelier {

    public static void dressMan(Dress[] dresses) {
        System.out.println("\nMan dresses:");
        for (Dress d: dresses) {
            if (d instanceof ToDressMan) {
                System.out.println(d);
            }
        }
    }

    public static void dressWoman(Dress[] dresses) {
        System.out.println("\nWoman dresses:");
        for (Dress d: dresses) {
            if (d instanceof ToDressWoman) {
                System.out.println(d);
            }
        }
    }
}
