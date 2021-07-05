package HW.HW11.Task3_3_5_Palindromes;

public class TextFormatter {

    public static int WordCounter(String sentence) {
        String[] splitSentence = sentence.split(" ");
        return splitSentence.length;
    }

    public static boolean isPalindrome(String sentence) {



        String[] splitSentence = sentence.split(" ");
        for (String s : splitSentence) {
            StringBuilder sb = new StringBuilder(s);
            if (s.equalsIgnoreCase(sb.reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
