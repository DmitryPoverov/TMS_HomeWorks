package Computer;

        import java.util.Scanner;

public class Running2 {

    public static void main(String[] args) {

        Computer2 comp1 = new Computer2("Intel", "Samsung", "Seagate");
        int countOn = 0;
        int countOff = 0;

        do {
            if (countOn==countOff) {
                System.out.println("\nEnter your choice:");
                System.out.println("- 1 if you want to turn on your computer;");
                System.out.println("- 3 if you want to show stat of your computer");
            } else if (countOn > countOff) {
                System.out.println("\nEnter your choice:");
                System.out.println("- 2 if you want to turn off your computer;");
                System.out.println("- 3 if you want to show stat of your computer");
            }

            Scanner scan = new Scanner(System.in);

            switch (scan.nextInt()) {
                case 1 -> {
                    comp1.turnOn();
                    countOn++;
                }
                case 2 -> {
                    comp1.turnOff();
                    countOff++;
                }
                case 3 -> comp1.showFields();
            }
        } while (!comp1.isBurned);

    }
}
