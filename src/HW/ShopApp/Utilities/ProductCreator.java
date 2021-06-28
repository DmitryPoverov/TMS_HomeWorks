package HW.ShopApp.Utilities;

import HW.ShopApp.Product;

import java.util.HashSet;
import java.util.Random;

public class ProductCreator {

    public static HashSet<Product> createProducts (int quantity) {

        HashSet<Product> prodShop = new HashSet<>();

        Random rnd = new Random();
        Product newProduct;
        int counter = 0;
        int id;
        String name;
        int price;

        while (counter < quantity) {

            id = rnd.nextInt(1000);
            name = Prods.values()[rnd.nextInt(Prods.values().length)].toString();
            price = rnd.nextInt(300);

            newProduct = new Product(id, name, price);

            prodShop.add(newProduct);
            counter++;
        }
        return prodShop;
    }

    public static Product createProduct (int id, String name, int price) {
        return new Product(id, name, price);
    }

}
