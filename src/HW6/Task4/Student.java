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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastName() {
        return firstName;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public String getGroup() {
        return group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    public double getAverageMark() {
        return averageMark;
    }

    int getScholarship() {
        if (averageMark<5) {
            return 80;
        } else {
            return 100;
        }
    }
}