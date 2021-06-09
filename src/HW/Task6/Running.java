package HW.Task6;

public class Running {

    public static void main(String[] args) {

        Cat animal1 = new Cat("meat", "house", "Mew", 28);
        System.out.println(animal1.eat());
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.howManyMise());

        System.out.println();

        Cat animal2 = new Cat("rats", "barn");
        animal2.setVoice("Meow");
        animal2.setMouseCounter(159);
        System.out.println(animal2.eat());
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.howManyMise());

        System.out.println();

        Dog animal3 = new Dog("bones", "kennel", "Bow-wow", 12);
        System.out.println(animal3.eat());
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.howManyCriminals());

        System.out.println();

        Horse animal4 = new Horse("oats", "stable", "Neigh", 24);
        System.out.println(animal4.eat());
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.maneLength());

        Veterinary doctor = new Veterinary("Hendrickson J.P.");

        Animal[] farm = {animal1, animal2, animal3, animal4};

        for (Animal a: farm) {
            System.out.println(doctor.treatAnimal(a));
        }
    }
}
