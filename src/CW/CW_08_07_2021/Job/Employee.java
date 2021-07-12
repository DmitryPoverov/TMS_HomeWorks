package CW.CW_08_07_2021.Job;

import java.util.Objects;
import java.util.Set;

public class Employee {

    private String name;
    private int age;
    private Set<Job> job;

    public Employee(String name, int age, Set <Job> job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Job> getJob() {
        return job;
    }

    public void setJob(Set<Job> job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", age=" + age +
                ", job=" + job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
