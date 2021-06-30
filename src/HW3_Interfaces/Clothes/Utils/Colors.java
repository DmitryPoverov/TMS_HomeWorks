package HW3_Interfaces.Clothes.Utils;

public enum Colors {

    COLOR1 ("Red"),
    COLOR2 ("Blue"),
    COLOR3 ("White"),
    COLOR4 ("Brown"),
    COLOR5 ("Green"),
    COLOR6 ("Black");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}