package HW6.Task4;

public class Student {

    private String firstName;
    private String lastname;
    private String group;
    private double averageMark;

    public Student (String firstName, String lastname, String group, double averageMark) {
        this.firstName = firstName;
        this.lastname =lastname;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getAverageMark () {
        return averageMark;
    }

    public String getFirstName () {
        return firstName;
    }

    int getScholarship () {
        if (averageMark<5) {
            return 80;
        } else {
            return 100;
        }
    }
}

class Aspirant extends Student {

    private String scientificWork;

    public Aspirant (String firstName, String lastname, String group, double averageMark, String scientificWork) {
        super(firstName, lastname, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getFirstName () {
        return firstName;
    }
    public String getScientificWork() {
        return scientificWork;
    }

    int getScholarship () {
        if (getAverageMark()<5) {
            return 180;
        } else {
            return 200;
        }
    }

}
