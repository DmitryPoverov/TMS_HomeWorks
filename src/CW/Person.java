package CW;

public class Person {

    private int id;

    public static Person p1 = new Person(5);
    public static Person p2 = new Person(10);
    public static Person p3 = new Person(0);
    public static Person p4 = new Person(1);

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
