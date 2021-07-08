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
        for (Goods shopGood : shopGoods) {
            if (shopGood.getId() == wG.getId()) {
                System.out.println("___ Such element exists");
                b = false;
            }
        }
        if (b){
            shopGoods.add(wG);
        }
    }

    public void addItem(int id, String name, int price) {
        boolean b = true;
        for (Goods shopGood : shopGoods) {
            if (shopGood.getId() == id) {
                System.out.println("_ Such element exists");
                b = false;
            }
        }
        if (b){
            shopGoods.add(new Goods(id, name, price));
            System.out.println("_ ADDED");
        }
    }

    public void deleteItem(Integer id) {
        int pointer = -10;
        for (int i=0; i<shopGoods.size(); i++) {
            if (shopGoods.get(i).getId() != id) {
            } else {
                pointer = i;
            }
        }
        shopGoods.remove(pointer);
        System.out.println("_ DELETED");
    }

    public void editItem(int idOld, int idNew, String name, int price) {
        int pointer = -10;
        for (int i=0; i<shopGoods.size(); i++) {
            if (shopGoods.get(i).getId() != idOld) {
            } else {
                pointer = i;
            }
        }
        shopGoods.get(pointer).setId(idNew);
        shopGoods.get(pointer).setName(name);
        shopGoods.get(pointer).setPrice(price);
        System.out.println("_ EDITED");
    }
}
