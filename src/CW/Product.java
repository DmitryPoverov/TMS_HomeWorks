package CW;

import CW.Utilities.Type;

import java.util.Objects;

public class Product {

    private int id;
    private String name;
    private int price;
    private Type type;

    public Product(int id, String name, int price, Type type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product (id: " + id + ", name: " + name + ", price: " + price + ", type:" + type + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
