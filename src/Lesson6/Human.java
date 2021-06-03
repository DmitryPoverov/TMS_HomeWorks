package Lesson6;

public class Human {
    String name;
    int age;
    int weight;
    int height;
    private Ability speed;

    public Human () {
        weight = 60;
        height = 180;
    }

    public Human (String name) {
        this.name = name;
        weight = 60;
        height = 180;
    }

    public Human (Ability ability) {
        speed = ability;
    }

    public void setAbility (Ability obj) {
        speed = obj;
    }

    public Ability getAbility () {
        return speed;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setAge (int age) {
        if (age<18) {
            System.out.println("Ты еще маленький!");
        } else {
            this.age = age;
        }
    }

    public int getAge () {
        return age;
    }

    private double bodyIndex ()  {
        return (double) weight / height;
    }

    public void showInfo () {
        System.out.printf("Name is %s, age is %d, weight is %d, height is %d, weight index is %f", name, age, weight, height, bodyIndex());
        System.out.println(speed.getName());
    }
}
