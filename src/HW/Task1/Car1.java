package HW.Task1;
import HW.Task1.Exceptions.OddNumberException;
import java.util.Random;

public class Car1 {

    String brand;
    int speed;
    int price;

    public Car1(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public void start() throws OddNumberException {
        Random rand = new Random();
        int rnd = rand.nextInt(11);
        if(rnd%2==0) {
            throw new OddNumberException(rnd, brand);
        } else {
            System.out.printf("Car %s started successfully\n", brand);
        }
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car: " + brand + ", speed: " + speed + ", price: " + price + ".";
    }
}
