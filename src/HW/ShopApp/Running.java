package HW.ShopApp;

import HW.ShopApp.Utilities.ProductCreator;

public class Running {
    public static void main(String[] args) {

        Shop shop1 = new Shop(2);

        for (Product p : shop1.getShop()) {
            System.out.println(p);
        }

        shop1.addProduct(ProductCreator.createProduct(715, "MITTENS", 88));
        shop1.addProduct(ProductCreator.createProduct(127, "HOODIE", 205));

        for (Product p : shop1.getShop()) {
            System.out.println(p);
        }

        System.out.println("-----------------------------");

        shop1.deleteProduct(715);

        for (Product p : shop1.getShop()) {
            System.out.println(p);
        }

        System.out.println("-----------------------------");

        shop1.editProduct(127, 569, "PULLOVER", 45);

        for (Product p : shop1.getShop()) {
            System.out.println(p);
        }

        System.out.println("-----------------------------");
    }
}
