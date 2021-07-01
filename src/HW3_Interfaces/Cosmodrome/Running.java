package HW3_Interfaces.Cosmodrome;

public class Running {
    public static void main(String[] args) {

        Shuttle rocket1 = new Shuttle();
        Shuttle rocket2 = new Shuttle();

        Cosmodrome place1 = new Cosmodrome();
        Cosmodrome place2 = new Cosmodrome();

        System.out.println("\nThe first rocket:");
        place1.Launch(rocket1);

        System.out.println("\nThe second rocket:");
        place2.Launch(rocket2);
    }
}
