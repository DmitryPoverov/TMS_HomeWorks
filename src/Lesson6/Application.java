package Lesson6;

public class Application {

    public static void main() {

        Human john = new Human();
        john.age = 22;
        john.name = "John";
        john.weight = 65;
        john.height = 180;
        System.out.println(john.getName());
    }
}
