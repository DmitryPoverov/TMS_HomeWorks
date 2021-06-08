package HW6.Task4;

public class Running {

    public static void main(String[] args) {

        Student stud0 = new Student("Bob", "Bob", "08HT", 5.0);
        Student stud1 = new Student();
        stud1.setFirstName("Tod");
        stud1.setLastname("Tod");
        stud1.setGroup("08PG");
        stud1.setAverageMark(4.0);
        Student stud2 = new Aspirant("Tim", "Tim", "07RT", 4.9, "Work0");
        Aspirant stud3 = new Aspirant("Sam", "Sam", "09TG", 5.0, "Work1");
        Aspirant stud4 = new Aspirant("Tom", "Tom", "10VV", 4.6, "Work2");

        Aspirant stud5 = (Aspirant) stud2;

        System.out.printf("Scholarship of %-10s is: %-5s\n", stud0.getFirstName(), stud0.getScholarship());
        System.out.printf("Scholarship of %-10s is: %-5s\n", stud1.getFirstName(), stud1.getScholarship());
        System.out.printf("Scholarship of %-10s is: %-5s\n", stud2.getFirstName(), stud2.getScholarship());
        System.out.printf("Scholarship of %-10s is: %-5s\n", stud3.getFirstName(), stud3.getScholarship());
        System.out.printf("Scholarship of %-10s is: %-5s\n", stud4.getFirstName(), stud4.getScholarship());

        System.out.printf("Student %s has: %s", stud4.getFirstName(), stud4.getScientificWork());

        stud0.getInfo();
        stud1.getInfo();
        stud2.getInfo();
        stud3.getInfo();
        stud4.getInfo();
        stud5.getInfo();

        stud5.setScientificWork("Work3");

        stud5.getInfo();
    }
}
