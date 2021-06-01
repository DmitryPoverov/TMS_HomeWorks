package HW_Phone;

public class Run {

    public static void main(String[] args) {

        Phone phone1 = new Phone(4545764, "samsung", 200);

        Phone phone2 = new Phone(9985656, "mi", 150);

        Phone phone3 = new Phone();

        phone3.setNumber(8779851);
        phone3.setModel("lg");
        phone3.setWeight(180);

        phone1.display();
        phone2.display();
        phone3.display();

        phone1.receiveCall("Max");
        int number = phone1.getNumber();
        System.out.println(number);

        phone2.receiveCall("Tom", 4564365);

        phone3.sendMessage(5465647, 6546545, 5445461, 8787997, 8893236);

    }

}
