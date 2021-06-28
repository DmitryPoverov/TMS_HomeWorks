package HW.ShopApp;

import HW.ShopApp.Utilities.ProductCreator;
import java.util.HashSet;

public class Shop {

    private HashSet <Product> newShop;

    public Shop() {
        newShop = new HashSet<>();
    }

    public Shop(int quantity) {
        newShop = new HashSet<>();
        newShop.addAll(ProductCreator.createProducts(quantity));
    }

    public HashSet<Product> getShop() {
        return newShop;
    }

    public void addProduct (Product p) {
        boolean b = newShop.add(p);
        System.out.println(b == true? "Product added" : "Product wasn't added");
    }

    public void deleteProduct (int id) {
        for (Product p : newShop) {
            if (p.getId() == id) {
                newShop.remove(p);
            }
        }
    }

    public void editProduct(int id, int i, String n, int pr) {

        for (Product p : newShop) {
            if (p.getId() == id) {
                p.setId(i);
                p.setName(n);
                p.setPrice(pr);
            }
        }
    }
}
