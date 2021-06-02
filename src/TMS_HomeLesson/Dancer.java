package TMS_HomeLesson;

class OriginDancer {
    String name;
    int age;

    public OriginDancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.printf("Я %s, мне %d, я танцую как все.\n", name, age);
    }

    public String toString() {
        return "Я " + name + ", мне " + age + " лет. " ;
    }
}

class ElectricBoogieDancer extends OriginDancer {
    public ElectricBoogieDancer(String name, int age) {
        super(name, age);
    }

    public void dance() {
        System.out.printf("Я %s, мне %d, я танцую  электрик буги!\n", name, age);
    }
}

class BreakDankDancer extends OriginDancer{

    public BreakDankDancer(String name, int age) {
        super(name, age);
    }

    public void dance(){
        System.out.printf("Я %s, мне %d, я танцую брейк-данс!\n", name, age);
    }
}

public class Dancer {

    public static void main(String[] args) {

        OriginDancer dancer = new OriginDancer("Антон", 18);
        OriginDancer breakDanceDancer = new BreakDankDancer("Алексей", 19);
        OriginDancer electricBoogieDancer = new ElectricBoogieDancer("Игорь", 20);

        dancer.dance();
        breakDanceDancer.dance();
        electricBoogieDancer.dance();

    }
}