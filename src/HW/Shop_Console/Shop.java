package HW.Shop_Console;

import java.util.*;

public class Shop {

    private List<Goods> shopGoods = new ArrayList<>();

    public Shop() {
    }

    public Shop(List<Goods> shopGoods) {
        this.shopGoods = shopGoods;
    }

    public void showAll(Comparator comparator){
        shopGoods.sort(comparator);
        for (Goods g : shopGoods) {
            System.out.println(g);
        }
    }

    public void addItem(Goods wG) {
        boolean b = true;
        for (int i=0; i<shopGoods.size(); i++) {
            if (shopGoods.get(i).getId() == wG.getId()) {
                System.out.println("Such element exists");
                b = false;
            }
        }
        if (b){
            shopGoods.add(wG);
        }
    }

    public void deleteItem() {

    }

    public void editItem() {

    }
}
