package CW.CW_08_07_2021.Job;

import java.util.*;
import java.util.stream.Collectors;

public class Running {
    public static void main(String[] args) {

        Job job1 = new Job("Constructor", 300);
        Job job2 = new Job("Painter", 200);
        Job job3 = new Job("Teacher", 350);
        Job job4 = new Job("Worker", 400);

        Employee employee1 = new Employee("Bob", 20, new HashSet<>(Arrays.asList(job1, job2)));
        Employee employee2 = new Employee("Ben", 25, new HashSet<>(Arrays.asList(job2)));
        Employee employee3 = new Employee("Tom", 30, new HashSet<>(Arrays.asList(job3, job4)));
        Employee employee4 = new Employee("Sam", 30, new HashSet<>(Arrays.asList(job1, job2, job3)));
        Employee employee5 = new Employee("Pit", 40, new HashSet<>(Arrays.asList(job1, job2, job4)));
        Employee employee6 = new Employee("Tim", 45, new HashSet<>(Arrays.asList(job1)));
        Employee employee7 = new Employee("Jim", 50, new HashSet<>(Arrays.asList(job2, job3, job4)));
        Employee employee8 = new Employee("Tom", 50, new HashSet<>(Arrays.asList(job1, job4)));
        Employee employee9 = new Employee("Tom", 60, new HashSet<>(Arrays.asList(job2, job4)));
        Employee employee0 = new Employee("Sam", 60, Set.of(job1, job3));

        List<Employee> employeesList = List.of
                (employee1, employee2, employee3, employee4, employee5,
                 employee6, employee7, employee8, employee9, employee0);

        double result = employeesList.stream().filter(i -> i.getAge()>35).count();
        System.out.println("Men over 35: " + (int)result);

        employeesList.stream()
                .filter(i -> {
                    if (i.getName().toLowerCase().contains("a") && i.getName().toLowerCase().contains("n")) {
                        return true;
                    }
                    return false;
                })
                .forEach(System.out::println);

        employeesList.stream()
                .map(Employee::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        employeesList.stream()
                .map(Employee::getAge)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nMore than 2 job:");
        List<Employee> employees = employeesList.stream()
                .filter(i -> i.getJob().size()>2)
                .collect(Collectors.toList());
        employees.forEach(System.out::println);

        System.out.println("\nName sorting.");
        employeesList.stream()
                .sorted((Comparator.comparing(Employee::getName)))
                .forEach(System.out::println);

        System.out.println("\nJob amount sorting.");
        employeesList.stream()
                .sorted(Comparator.comparing(x -> x.getJob().size()))
                .forEach(System.out::println);


        System.out.println("\nSalary statistics:");
        IntSummaryStatistics statistics = employeesList.stream()
                .map(Employee::getJob)
                .flatMap(Collection::stream)
                .mapToInt(Job::getSalary)
                .summaryStatistics();

        System.out.printf(
                "max %d\n" +
                "min %d\n" +
                "middle %.2f \n" +
                "summary %d\n",
                statistics.getMax(), statistics.getMin(), statistics.getAverage(), statistics.getSum());
    }
}