package HW.Task1.Exceptions;

public class OddNumberException extends Exception{

    private int number;
    private String brand;

    public OddNumberException(int number, String brand) {
        this.number = number;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car " + brand + " didn't start. OddNumberException: number=" + number + ".";
    }
}
