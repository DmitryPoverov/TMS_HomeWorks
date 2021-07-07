package HW.Shop_Console;


import java.util.ArrayList;
import java.util.List;

public class Running {
    public static void main(String[] args) {

        Goods item1 = new Goods(100, "Jeans", 120);
        Goods item2 = new Goods(101, "Jacket", 130);
        Goods item3 = new Goods(102, "West", 140);
        Goods item4 = new Goods(100, "Jeans2", 110);
        Goods item5 = new Goods(103, "Skirt", 110);


        List<Goods> shop1Goods = new ArrayList<>();
        shop1Goods.add(item1);
        shop1Goods.add(item2);

        Shop shop1 = new Shop(shop1Goods);
        shop1.addItem(item3);

        int userChoice = -1;

        while (userChoice != 0) {

            ShopConsole myShop = new ShopConsole(shop1);
            myShop.showMenu();
            userChoice = myShop.getUserChoice();
            myShop.action(userChoice);

        }
    }
}
