package dmLessons.lambdaExpressonsDM;

import dmLessons.Student.Student;

import java.util.Optional;
import java.util.stream.Stream;

public class mapReduceExample {
    public static void main(String[] args) {

        Optional<Student> maybeStudent = Stream.of(
                        new Student(20, "Alice"),
                        new Student(21, "Bob"),
                        new Student(22, "Bill"),
                        new Student(23, "Sam"),
                        new Student(24, "Jim"),
                        new Student(25, "Ivan"),
                        new Student(26, "Paul"),
                        new Student(27, "Anna")
                )
                //.parallel()       // распараллеливание вычислений
                //.sequential()     // обработать все в одином потоке
                //.map(student -> student.getAge())
                //.reduce((age1, age2) -> Math.max(age1, age2))
                .filter(student -> student.getAge()>20 & student.getAge()<25)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);

        maybeStudent.ifPresent(System.out::println);

        System.out.println("---------------------------------------------------------------------------------");

        maybeStudent.map(student -> student.getAge())
                .filter(age -> age < 24);
        System.out.println(maybeStudent);
    }
}
