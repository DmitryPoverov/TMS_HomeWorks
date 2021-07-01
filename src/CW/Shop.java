package CW;

import java.util.Iterator;
import java.util.List;

public class Shop {

    private List<Product> shopProducts;

    public Shop(List<Product> shop1) {
        this.shopProducts = shop1;
    }

    public boolean addProduct(Product prod) {
        if (!shopProducts.contains(prod)) {
            return shopProducts.add(prod);
        }
        System.out.println("This product was inserted");
        return false;
    }

    public void showAll() {
        for (Product p : shopProducts) {
            System.out.println(p);
        }
    }

    public List<Product> getShop1() {
        return shopProducts;
    }

    public void deleteProd(int id) {
        Iterator<Product> iterator = shopProducts.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
            }
        }
    }

    public void editProd(Product p) {
        for (Product prod : shopProducts) {
            if (prod.getId() == p.getId()) {
                prod.setPrice(p.getPrice());
                prod.setName(p.getName());
                prod.setType(p.getType());
            }
        }
    }

    public void showReverse() {
        for (int i=shopProducts.size()-1; i>=0; i--) {
            System.out.println(shopProducts.get(i));
        }
    }
}
