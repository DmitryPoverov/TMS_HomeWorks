package CW;

import CW.Product;

import java.util.Iterator;
import java.util.List;

public class Shop {

    private List<Product> shop1;

    public Shop(List<Product> shop1) {
        this.shop1 = shop1;
    }

    public boolean addProduct(Product prod) {
        if (!shop1.contains(prod)) {
            return shop1.add(prod);
        }
        System.out.println("This product was inserted");
        return false;
    }

    public void showAll() {
        for (Product p : shop1) {
            System.out.println(p);
        }
    }

    public List<Product> getShop1() {
        return shop1;
    }

    public void deleteProd(int id) {
        Iterator<Product> iterator = shop1.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
            }
        }
    }

    public void editProd(Product p) {
        for (Product prod : shop1) {
            if (prod.getId() == p.getId()) {
                prod.setPrice(p.getPrice());
                prod.setName(p.getName());
                prod.setType(p.getType());
            }
        }
    }

    public void showReverse() {
        for (int i=shop1.size()-1; i>=0; i--) {
            System.out.println(shop1.get(i));
        }
    }


}
