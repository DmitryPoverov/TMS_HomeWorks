package HW.Task6;

public class Veterinary {

    private String name;

    public Veterinary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String treatAnimal(Animal animal) {
        return "\nAt the veterinary appointment:\nDoctor: " + getName()
                + "\nAbout animal:\neats: " + animal.getFood()
                + "\nlives: " + animal.getLocation();

    }
}
