package HW.HW11.SerializeAuto;

import java.io.Serializable;

public class Auto implements Serializable {

    String brand;
    int price;
    int speed;

    public Auto(String brand, int price, int speed) {
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return brand + " (price: " + price + " usd, speed: " + speed + " km/h)";
    }
}
