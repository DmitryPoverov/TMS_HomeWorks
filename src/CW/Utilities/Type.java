package CW.Utilities;

public enum Type {

    BESTSELLER (10),
    REGULAR (0),
    SPECIAL (5);
    private int value;

    Type(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}
