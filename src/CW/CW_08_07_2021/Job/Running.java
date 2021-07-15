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
        Employee employee2 = new Employee("Ben", 25, new HashSet<>(Collections.singletonList(job2)));
        Employee employee3 = new Employee("Tom", 30, new HashSet<>(Arrays.asList(job3, job4)));
        Employee employee4 = new Employee("Sam", 30, new HashSet<>(Arrays.asList(job1, job2, job3)));
        Employee employee5 = new Employee("Pit", 40, new HashSet<>(Arrays.asList(job1, job2, job4)));
        Employee employee6 = new Employee("Tim", 45, new HashSet<>(Collections.singletonList(job1)));
        Employee employee7 = new Employee("Jim", 50, new HashSet<>(Arrays.asList(job2, job3, job4)));
        Employee employee8 = new Employee("Tom", 50, new HashSet<>(Arrays.asList(job1, job4)));
        Employee employee9 = new Employee("Tom", 60, new HashSet<>(Arrays.asList(job2, job4)));
        Employee employee0 = new Employee("Sam", 60, Set.of(job1, job3));

        List<Employee> employeesList = List.of
                (employee1, employee2, employee3, employee4, employee5,
                 employee6, employee7, employee8, employee9, employee0);

        Optional<Employee> opt = employeesList.stream().min(Comparator.comparing(Employee::getAge));

        System.out.println("\nPrinted Optional<Employee>:\n" + opt);

        System.out.println("\nPrinted Optional<Employee> after .get().getJobs:\n" + opt.get().getJobs());

        System.out.println("\nPrinted ordinary Employee:\n" + employee1);

        System.out.println("\nPrinted class of Employee:\n" + opt.get().getClass().getSimpleName());

        System.out.println("\nA list after skipping of employees (Array of Object):");
        Object[] employeeList2 = employeesList.stream().skip(7).toArray();
        for (Object o : employeeList2) {
            System.out.println(o);
        }

        System.out.println("\nA list after skipping of employees:");
        employeesList.stream()
                .skip(7)
                .forEach(System.out::println);

        System.out.println("\nA list of employees:");
        employeesList
                .forEach(System.out::println);

        System.out.println("\nA list after filtering by age (less than 35):");
        employeesList.stream()
                .takeWhile(tw -> tw.getAge()<35)
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        System.out.println("\nThe total amount of all salaries:");
        int totalSalary = Arrays.stream(employeesList.stream()
                .map(v -> v.getJobs())          // Из коллекции выдается коллекция работ каждого человека
                .flatMap(r -> r.stream())       // Из коллекции работ делается поток
                .mapToInt(j -> j.getSalary())   // создается поток из интов из зарплат
                .toArray()).sum();
        System.out.println(totalSalary);

//        System.out.println("The biggest salary:");
//        Set<Job> set1 = employeesList.stream().map(Employee::getJobs).mapToInt(i -> i.getSalary);

        Set<Integer> jobSalaries = null;



        System.out.println("\nSalary statistics:");
        IntSummaryStatistics statistics = employeesList.stream()
                .map(Employee::getJobs)
                .flatMap(Collection::stream)
                .mapToInt(Job::getSalary)
                .summaryStatistics();

        System.out.printf(
                """
                        max:     %d
                        min:     %d
                        middle:  %.2f\s
                        summary: %d
                        """,
                statistics.getMax(), statistics.getMin(), statistics.getAverage(), statistics.getSum());


        double result = employeesList.stream().filter(i -> i.getAge()>35).count();
        System.out.println("\nMen over 35: " + (int)result);

        employeesList.stream()
                .filter(i -> i.getName().toLowerCase().contains("a") && i.getName().toLowerCase().contains("n"))
                .forEach(System.out::println);

        System.out.println("\nUnique names:");
        employeesList.stream()
                .map(Employee::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nUnique ages:");
        employeesList.stream()
                .map(Employee::getAge)
                .distinct()
                .sorted()
                .forEach(System.out::println);


        System.out.println("\nMore than 2 job:");
        List<Employee> employees = employeesList.stream()
                .filter(i -> i.getJobs().size()>2)
                .collect(Collectors.toList());
        employees.forEach(System.out::println);


        System.out.println("\nName sorting.");
        employeesList.stream()
                .sorted((Comparator.comparing(Employee::getName)))
                .forEach(System.out::println);


        System.out.println("\nSorting by number of jobs.");
        employeesList.stream()
                .sorted(Comparator.comparing(x -> x.getJobs().size()))
                .forEach(System.out::println);

    }
}