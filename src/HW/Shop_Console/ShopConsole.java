package HW.Shop_Console;

import HW.Shop_Console.Utils.ComparatorNewOld;
import HW.Shop_Console.Utils.ComparatorOldNew;
import HW.Shop_Console.Utils.ComparatorPriceDown;
import HW.Shop_Console.Utils.ComparatorPriceUp;

import java.util.Scanner;

public class ShopConsole {

    private Shop currentShop;

    public ShopConsole(Shop currentShop) {
        this.currentShop = currentShop;
    }

    public void showMenu() {
        System.out.println("\n------------------------------------------\n| 1 - to show goods (lowest to highest). |\n" +
                "| 2 - to show goods (highest to lowest). |\n" +
                "| 3 - to show goods (newest to oldest). |\n" +
                "| 4 - to show goods (oldest to newest). |\n" +

                "| 0 - to exit the shop.\t\t\t\t\t |\n------------------------------------------");
    }

    public int getUserChoice() {
        System.out.print("Enter your choice here: ");
        int choice =  new Scanner(System.in).nextInt();
        System.out.println();
        return choice;
    }

    public void action(int userChoice) {
        switch (userChoice) {
            case 1 -> currentShop.showAll(new ComparatorPriceUp());
            case 2 -> currentShop.showAll(new ComparatorPriceDown());
            case 3 -> currentShop.showAll(new ComparatorNewOld());
            case 4 -> currentShop.showAll(new ComparatorOldNew());


            case 0 -> System.out.println("EXIT THE SHOP");
            default -> System.out.println("!!! The wrong choice !!!");
        }
    }
}
