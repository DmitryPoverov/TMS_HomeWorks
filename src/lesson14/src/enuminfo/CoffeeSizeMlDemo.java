package lesson14.src.enuminfo;

public class CoffeeSizeMlDemo {
    public static void main(String[] args) {
        for (CoffeeSize2 coffeeSize : CoffeeSize2.values()) {
            System.out.println(coffeeSize + " " + coffeeSize.getMl());
        }
    }
}
