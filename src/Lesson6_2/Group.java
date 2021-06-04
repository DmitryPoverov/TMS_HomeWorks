package Lesson6_2;

public class Group {

    private String name;
    private Student[] group;

    public Group(String name, Student[] students) {
        this.name = name;
        group = students;
    }

    public void getTotalInfo() {
        for (int i=0; i<group.length; i++) {
            group[i].getInfo();
            System.out.println(", his group is " + name);
        }
    }
}
