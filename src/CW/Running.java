package CW;

import CW.Utilities.MyComparator;
import CW.Utilities.Type;

import java.util.ArrayList;

public class Running {
    public static void main(String[] args) {

        Shop shop1 = new Shop(new ArrayList<>());

        shop1.addProduct(new Product(10, "TV_set", 150, Type.BESTSELLER));
        shop1.addProduct(new Product(150, "DVD", 15, Type.REGULAR));
        shop1.addProduct(new Product(18, "Phone", 10, Type.BESTSELLER));
        shop1.addProduct(new Product(101, "PS4", 1500, Type.SPECIAL));

        System.out.println("\nOriginal-list-------------------");
        shop1.showAll();

        System.out.println("\nList-after-deleting-------------");
        shop1.deleteProd(10);

//      Collections.reverse(shop1.getShop1());

        shop1.showReverse();

        System.out.println("\nReversed-list-------------------");
        shop1.showAll();

        MyComparator myComparator = new MyComparator();
        shop1.getShop1().sort(myComparator);

        System.out.println("\nSorting-by-price-----------------");
        shop1.showAll();

        shop1.addProduct(new Product(150, "iPod", 315, Type.BESTSELLER));
        System.out.println("\nAfter-product-adding-------------");
        shop1.showAll();

        shop1.editProd(new Product(18, "Walkman", 50, Type.REGULAR));
        System.out.println("\nAfter-product-changing------------");
        shop1.showAll();
    }
}
