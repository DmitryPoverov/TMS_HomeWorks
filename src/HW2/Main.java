package HW2;

public class Main {

    public static void main(String[] args) {

        int AB, BC, CD;
        AB = 7;
        BC = 0;
        CD = 14;

        if (AB == 0 || BC == 0 || CD == 0) {
            System.out.println("No one of sides can be 0");
        } else if ((AB+BC>CD) && (BC+CD>AB) && (AB+CD>BC)) {
            System.out.println("The such triangle exists");
        } else {
            System.out.println("The such triangle doesn't exist");
        }
    }
}