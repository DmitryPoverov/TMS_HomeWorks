package DP;

public class HW_1 {

    public static void main(String[] args) {

        double dist = 10;
        double perc = 0.1;
        double top = dist;

        for (int i=2; i<8; i++) {

            dist += dist * perc;
            System.out.printf("За %d день %.2f", i, dist);

            System.out.println();
            top += dist;
        }
        System.out.printf("Distance = %10.2f", top);
    }
}
