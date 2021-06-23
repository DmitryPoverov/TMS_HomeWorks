package CW.BufferedReader_Palindrome;

public class PalindromeCheck {

    public static boolean isPalindrome(String line) {
        StringBuffer sBuffer = new StringBuffer(line);
        StringBuffer reverse = sBuffer.reverse();
        String checkLine = reverse.toString();
        return line.equalsIgnoreCase(checkLine);
    }

}
