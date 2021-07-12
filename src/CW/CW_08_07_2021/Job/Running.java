package CW.CW_08_07_2021.Job;

import java.util.*;
import java.util.stream.Collectors;

public class Running {
    public static void main(String[] args) {

        Job job1 = new Job("Construction", 300);
        Job job2 = new Job("Painter", 200);
        Job job3 = new Job("Teacher", 350);
        Job job4 = new Job("Worker", 400);



        Employee employee1 = new Employee("Bob", 20, new HashSet<Job>(Arrays.asList(job1, job2)));
        Employee employee2 = new Employee("Bill", 25, new HashSet<Job>(Arrays.asList(job2, job3)));
        Employee employee3 = new Employee("Tom", 30, new HashSet<Job>(Arrays.asList(job3, job4)));
        Employee employee4 = new Employee("Sam", 35, new HashSet<Job>(Arrays.asList(job1)));
        Employee employee5 = new Employee("Pit", 40, new HashSet<Job>(Arrays.asList(job2)));
        Employee employee6 = new Employee("Tim", 45, new HashSet<Job>(Arrays.asList(job3)));
        Employee employee7 = new Employee("Jom", 50, new HashSet<Job>(Arrays.asList(job4)));
        Employee employee8 = new Employee("Hank", 55, new HashSet<Job>(Arrays.asList(job1, job4)));
        Employee employee9 = new Employee("John", 60, new HashSet<Job>(Arrays.asList(job2, job4)));
        Employee employee10 = new Employee("Stan", 65, Set.of(job1, job3));

        List<Employee> employeesList = List.of(employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10);
        double result = employeesList.stream().filter(i -> i.getAge()>30).count();
        System.out.println("30 over " + result);

        employeesList.stream().filter(i -> {
            if (i.getName().toLowerCase().contains("k") && i.getName().toLowerCase().contains("t")) {
                return true;
            }
            return false;
        }).forEach(System.out::println);

//        employeesList.stream().distinct().sorted(Comparator.comparing((x,y) -> x.getName().compareTo(y.)))
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

        System.out.println("\nMore than 1 job.");
        List<Employee> employees = employeesList.stream()
                .filter(i -> i.getJob().size()>1)
                .collect(Collectors.toList());


        System.out.println("\nName sorting.");
        employeesList.stream()
                .sorted((Comparator.comparing(Employee::getName)))
                .forEach(System.out::println);


        System.out.println("\nJob amount sorting.");
        employeesList.stream()
                .sorted(Comparator.comparing(x -> x.getJob().size()))
                .forEach(System.out::println);

        System.out.println("Salary statistics");
        IntSummaryStatistics statistics = employeesList.stream()
                .map(Employee::getJob)
                .flatMap(Collection::stream)
                .mapToInt(Job::getSalary)
                .summaryStatistics();

        System.out.printf(
                "max %d\n" +
                "min %d\n" +
                "middle %.2f \n" +
                "summary %d\n", statistics.getMax(), statistics.getMin(), statistics.getAverage(), statistics.getSum());
//        employeesList.stream().min(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                o1.getJob().
//            }
//        })
    }
}
