package HW_Phone2;

public class Run {

    public static void main(String[] args) {

        Person man1 = new Person();

        Person man2 = new Person("Tom", 27);

        man1.move();
        man1.talk();
        man2.move();
        man2.talk();
    }
}
