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
        System.out.println("""
                        \t\t------------------------------------------
                        \t\t|              Shop menu                 |
                        \t\t|----------------------------------------|
                        \t\t| 1 - to show goods (lowest to highest). |
                        \t\t| 2 - to show goods (highest to lowest). |
                        \t\t| 3 - to show goods (newest to oldest).  |
                        \t\t| 4 - to show goods (oldest to newest).  |
                        \t\t| 5 - to delete item (enter the id)      |
                        \t\t| 6 - to add item (enter the id)         |
                        \t\t| 7 - to edit item (enter the id)        |
                        \t\t| 0 - to exit the shop.                  |
                        \t\t------------------------------------------""");
    }

    public int getUserChoice() {
        System.out.print("Enter your choice here (integer): ");
        int choice =  new Scanner(System.in).nextInt();
        System.out.println();
        return choice;
    }

        public String getUserStringChoice() {
        System.out.print("Enter your choice here (String): ");
        String choice =  new Scanner(System.in).nextLine();
        System.out.println();
        return choice;
    }

    public void action(int userChoice) {
        switch (userChoice) {
            case 1 -> currentShop.showAll(new ComparatorPriceUp());
            case 2 -> currentShop.showAll(new ComparatorPriceDown());
            case 3 -> currentShop.showAll(new ComparatorNewOld());
            case 4 -> currentShop.showAll(new ComparatorOldNew());
            case 5 -> currentShop.deleteItem(getUserChoice());
            case 6 -> currentShop.addItem(getUserChoice(), getUserStringChoice(), getUserChoice());
            case 7 -> currentShop.editItem(getUserChoice(), getUserChoice(), getUserStringChoice(), getUserChoice());
            case 0 -> System.out.println("EXIT THE SHOP");
            default -> System.out.println("!!! The wrong choice !!!\n");
        }
    }
}
