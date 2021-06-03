package Lesson6_2;

public class Running {

    public static void main(String[] args) {

//        Student st1 = new Student("John", 18, 8.9);
//        Student st2 = new Student("Jeremy", 19, 9.0);
//        Student st3 = new Student("Bill", 17, 7.9);
//        Student st4 = new Student("Poll", 19, 9.0);

        Student [] students = new Student[4];

        for (int i=0; i<students.length; i++) {
            students[i] = new Student("John"+i, 18+i, 7.9+i);
        }

        Group team = new Group("08-XT3", students);

        team.getTotalInfo();
    }
}
