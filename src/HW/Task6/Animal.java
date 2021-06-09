package HW.Task6;

public class Animal {

    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }

    public String makeNoise() {
        return "An animal can speaks. ";
    }

    public String eat() {
        return "An animal has to eat. ";
    }
}
