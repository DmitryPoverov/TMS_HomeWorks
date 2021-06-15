package HW9.Task1_2;

public class Cutter {

    private String s;
    private char c1;
    private char c2;

    public Cutter(String s) {
        this.s = s;
    }

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

    public String change3to0() {
        if (s.length() > 3) {
            s = s.replace(s.charAt(3), s.charAt(0));
        }
        return s;
    }

    public String palindromeSearch() {
        String s1 = "";
        char[] charArray = s.toCharArray();
        for (int i=charArray.length-1; i>=0; i--) {
            s1 += charArray[i];
        }
        return s1;
    }
}
