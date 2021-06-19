package HW.Task1_2.Exception;

public class OddException extends Exception {

    private final String brand;
    private final int brokeNumber;

    public OddException(String brand, int brokeNumber) {
        this.brand = brand;
        this.brokeNumber = brokeNumber;
    }

    @Override
    public String toString() {
        return "\t\tOddException! " + brand + " has fail. Breaking number: " + brokeNumber;
    }
}
