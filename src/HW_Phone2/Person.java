package HW_Phone2;

public class Person {

    private final String name;  // idea порекомендовала name сделать final
    private int age;

    public Person () {
        this.name = "user";
        this.age = 18;
    }

    public Person (String name) {
        this.name = name;
    }

    public Person (String name, int age) {
        this(name);
        this.age = age;
    }

    public void move() {
        System.out.println(name + ", " + age + " years " + " is moving ");
    }

    public void talk() {
        System.out.println(name + ", " + age + " years " + " is talking ");
    }
}
