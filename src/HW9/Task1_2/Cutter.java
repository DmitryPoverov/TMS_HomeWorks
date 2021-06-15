package HW9.Task1_2;

public class Cutter {

    private String s;
    private char c1;
    private char c2;

    public Cutter(String s, char c1, char c2) {
        this.s = s;
        this.c1 = c1;
        this.c2 = c2;
    }

    public String returnString() {
        int a = s.indexOf(c1);
        int b = s.indexOf(c2);
        if (a!=-1 && b!=-1) {
            s = s.substring(a, b);
        } else if (a == -1) {
            s = "There is no one the " + c1 + " character here";
        } else if (b == -1) {
            s = "There is no one the " + c2 + " character here";
        } else {
            s = "!!! Something went wrong !!!";
        }
        return s;
    }

}
