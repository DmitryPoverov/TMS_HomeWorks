package Lesson5;

public class Person {

    private int age;
    private String name;

    Person (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
       return age;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
