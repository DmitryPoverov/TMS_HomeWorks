package HW.HW_Examples.Comparable_Example;

public class Dog implements Comparable<Dog> {

    private int age;
    private String name;
    private double weight;

    public Dog(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dog: " + age + ", " + name + ", " + weight + ".";
    }

    @Override
    public int compareTo(Dog o) {
        int i = 0;
        if (weight < o.getWeight()) {
            i = -1;
        } else if (weight > o.getWeight()) {
            i = 1;
        } else if (weight == o.getWeight()) {
            i = 0;
        }
        return i;
    }
}
