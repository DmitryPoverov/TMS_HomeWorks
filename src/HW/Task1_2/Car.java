package HW.Task1_2;

import HW.Task1_2.Exception.OddException;
import java.util.Random;

public class Car {

    private String brand;
    private int speed;
    private int price;
//
//    public Car() {
//    }
//
    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
    public String getBrand() {
        return brand;
    }
    public int getSpeed3() {
        return speed;
    }
    public int getPrice3() {
        return price;
    }


    public void start() throws OddException {
        Random rNum = new Random();
        int num = rNum.nextInt(21);
         if (num%2==0) {
             throw new OddException(this, num);
         } else {
             System.out.println(brand + "(" + speed + "|"  + price + ") started");
         }
    }
}
