package HW.Shop_Console;

import java.util.Objects;

public class Goods {

    private Integer id;
    private String name;
    private int price;
    private final int place;
    private static int counter = 0;

    public Goods(Integer id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        place = ++counter;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getPlace() {
        return place;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

//    @Override
//    public int compareTo(Goods g) {
//        if (id.compareTo(g.getId()) == -1) {
//            return -1;
//        }
//        else if ((id.compareTo(g.getId()) == 1)) {
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Goods goods = (Goods) o;
//        return id.equals(goods.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    @Override
    public String toString() {
        return name + " (id: " + id + ", " + "price = " + price + ')';
    }
}
