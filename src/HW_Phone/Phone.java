package HW_Phone;

public class Phone {

    private int number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model, int weight) {
        this(model, weight);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void display () {
        System.out.println(number + " " + model + " " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Is calling " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println(name + " is calling, number is " + number);
    }

    public void sendMessage (int ... number) {
        for (int i: number) {
            System.out.println("Message to the number " + i);
        }
    }
}
