package CW.CW_08_07_2021.Job;

public class Job {

    private String name;
    private int salary;

    public Job(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (salary: " + salary + ')';
    }
}
