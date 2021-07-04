package HW;

public class Running {
    public static void main(String[] args) {

        String s1 ="Level";
        String s2 ="roller";
        String s3 ="Rotor";
        String s4 ="Ball";

        isPalindrome(s1);
        isPalindrome(s2);
        isPalindrome(s3);
        isPalindrome(s4);
    }

    public static void isPalindrome(String text) {

        StringBuilder sB = new StringBuilder(text);
        System.out.println(text.equalsIgnoreCase(sB.reverse().toString()) +"\n");
    }
}


