package CW.CW_08_07_2021.Job;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Running {
    public static void main(String[] args) {

        Job job1 = new Job("Constructor", 300);
        Job job2 = new Job("Painter", 200);
        Job job3 = new Job("Teacher", 350);
        Job job4 = new Job("Worker", 400);

        Employee employee1 = new Employee("Bob", 60, new HashSet<>(Arrays.asList(job1, job2)));
        Employee employee2 = new Employee("Ben", 50, new HashSet<>(Collections.singletonList(job2)));
        Employee employee3 = new Employee("Tom", 30, new HashSet<>(Arrays.asList(job3, job4)));
        Employee employee4 = new Employee("Sam", 30, new HashSet<>(Arrays.asList(job1, job2, job3)));
        Employee employee5 = new Employee("Pit", 45, new HashSet<>(Arrays.asList(job1, job2, job4)));
        Employee employee6 = new Employee("Tim", 45, new HashSet<>(Collections.singletonList(job1)));
        Employee employee7 = new Employee("Jim", 50, new HashSet<>(Arrays.asList(job2, job3, job4)));
        Employee employee8 = new Employee("Tom", 50, new HashSet<>(Arrays.asList(job1, job4)));
        Employee employee9 = new Employee("Tom", 60, new HashSet<>(Arrays.asList(job2, job4)));
        Employee employee0 = new Employee("Sam", 60, Set.of(job1, job3));

        int resulting = Stream.of(employee0, employee1, employee2)
                .map(Employee::getAge)             // .map(a -> a.getAge());
                .reduce(0, Integer::sum);   // .reduce(0, (a, b) -> a + b);
//              .get();                   // если у reduce есть "начало", то он возвращает его тип, а не Optional
        System.out.println(resulting);


        List<Employee> employeesList = List.of
                (employee1, employee2, employee3, employee4, employee5,
                        employee6, employee7, employee8, employee9, employee0);


        Stream<Employee> employeeStream = employeesList.stream();

        System.out.println("\nEmployees by ages:");
        Map<Integer, List<Employee>> employeeByAges1 = employeeStream
                .collect(Collectors.groupingBy(Employee::getAge));

        for (Map.Entry<Integer, List<Employee>> worker : employeeByAges1.entrySet()) {
            System.out.println("\n" + worker.getKey());

            for (Employee employee : worker.getValue()) {
                System.out.println(employee.getName());
            }
        }


        System.out.println("\nAmount of employees by ages:");
        Map<Integer, Long> employeeByAges2 = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));

        for (Map.Entry<Integer, Long> worker : employeeByAges2.entrySet()) {
            System.out.println(worker.getKey() + " years: " + worker.getValue() + " persons.");
        }


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
                .takeWhile(tw -> tw.getAge() < 35)
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);


        System.out.println("\nThe total amount of all salaries:");
        int totalSalary = Arrays.stream(employeesList.stream()
                .map(Employee::getJobs)         // Из коллекции выдается коллекция работ каждого человека
                .flatMap(r -> r.stream())       // Из коллекции работ делается поток
                .mapToInt(t -> t.getSalary())   // создается интовый поток взятый из зарплат
                .toArray()).sum();
        System.out.println(totalSalary);


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


        System.out.println();
        Optional <Employee> richest = employeesList.stream()
                .sorted((a, b) -> {
                    Set<Job> setA = a.getJobs();
                    int sumA = 0;
                    for (Job job : setA) {
                        sumA += job.getSalary();
                    }
                    Set<Job> setB = b.getJobs();
                    int sumB = 0;
                    for (Job job : setB) {
                        sumB += job.getSalary();
                    }
                    return Integer.compare(sumB, sumA);
                }).findFirst();
        System.out.println(richest.get());


        System.out.println("\nThe salary of 900 and more has:");
        employeesList.stream()
                .filter(v -> {
                    Set<Job> setJ = v.getJobs();
                    int salary = 0;
                    for (Job j : setJ) {
                        salary += j.getSalary();
                    }
                    return salary>899;

                }).forEach(System.out::println);


        System.out.println("\nA list of unique professions:");
        String str = employeesList.stream()
                .map(v -> {
                    Set<Job> setJ = v.getJobs();
                    StringBuilder professions = new StringBuilder();
                    for (Job j : setJ) {
                        professions.append(j.getName()).append(' ');
                    }
                    return professions.toString();
                }).reduce((x,y) -> x + " " + y).get();

        String[] str2 = str.split(" ");
        Arrays.stream(str2)
                .filter(v -> v.length()>0)
                .distinct()
                .forEach(System.out::println);


        System.out.println("\nA list of unique professions:");
        employeesList.stream()
                .map(Employee::getJobs)
                .flatMap(Collection::stream)
                .map(Job::getName)
                .distinct()
                .forEach(System.out::println);


        double result = employeesList.stream().filter(i -> i.getAge() > 35).count();
        System.out.println("\nMen over 35: " + (int) result);


        employeesList.stream()
                .filter(i -> i.getName().toLowerCase().contains("a") && i.getName().toLowerCase().contains("n"))
                .forEach(System.out::println);


        System.out.println("\nUnique names 1:");
        List<String> listEmployee = employeesList.stream()
                .map(Employee::getName)
                .distinct()
//                .sorted()
                .collect(Collectors.toList());
        listEmployee.forEach(System.out::println);


        System.out.println("\nUnique names 2:");
        employeesList.stream()
                .map(Employee::getName)
                .distinct()
//                .sorted()
                .forEach(System.out::println);


        System.out.println("\nUnique ages:");
        employeesList.stream()
                .map(Employee::getAge)
                .distinct()
                .sorted()
                .forEach(System.out::println);


        System.out.println("\nMore than 2 job:");
        List<Employee> employees = employeesList.stream()
                .filter(i -> i.getJobs().size() > 2)
                .collect(Collectors.toList());
        employees.forEach(System.out::println);


        System.out.println("\nSorting by names.");
        employeesList.stream()
                .sorted((Comparator.comparing(Employee::getName)))
                .forEach(System.out::println);


        System.out.println("\nSorting by number of jobs.");
        employeesList.stream()
                .sorted(Comparator.comparing(x -> x.getJobs().size()))
                .forEach(System.out::println);
    }
}