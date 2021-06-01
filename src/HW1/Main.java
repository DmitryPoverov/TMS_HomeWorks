package HW1;

public class Main {

    public static void main(String[] args) {

        int num = -1000;

        if (num > 0) {
            System.out.println(num + " больше нуля");
        } else if (num < 0) {
            System.out.println(num + " меньше нуля");
        } else {
            System.out.println(num + " равен нулю");
        }

        if (num/100 != 0) {
            System.out.println("Число - трехзначное или более");
        } else if (num/10 != 0) {
            System.out.println("Число - двузначное");
        } else {
            System.out.println("Число - однозначное");
        }
    }
}