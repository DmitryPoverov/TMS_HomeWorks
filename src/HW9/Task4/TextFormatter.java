package HW9.Task4;

import java.util.Arrays;

public class TextFormatter {

    private String s;

    public TextFormatter(String s) {
        this.s = s;
    }

    public void showStringInArray(String[] str) {
        for (String st : str) {
            System.out.println(st);
        }
    }
//
//    public void showStringInfo(String str) {
//        System.out.println("Sentence : \""
//                + str + "\" has "
//                + wordCounter(str) + " words");
//    }
//
    public int spaceCounter() {
        int sCounter = 0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == (char) 46) {
                sCounter++;
            }
        }
        return sCounter;
    }

    public int wordCounter(String str) {
        int wCounter = 0;

        for (int i=0; i<str.length(); i++) {
            if ((str.charAt(i) == (char) 32) || (str.charAt(i) == (char) 46)) {
                wCounter++;
            }
        }
        return wCounter;
    }
//    public String[] stringToArrayString() {
//        char[] charArray1 = s.toCharArray();
//        String[] strArray = new String[wordCounter(s)];
//        for (int i=0, j=0; i<charArray1.length; i++ ) {
//
//        }
//    }
    public boolean isPalindromes(String str) {
        boolean isPalHere = false;

        String[] strArr1 = new String[wordCounter(str)];
        char[] charString1 = str.toCharArray();
        Arrays.fill(strArr1, "");

        String[] strArr2 = new String[wordCounter(str)];
        char[] charString2 = str.toCharArray();
        Arrays.fill(strArr2, "");

        for (int i=0, j=0; i<charString1.length; i++) {
            if (charString1[i] != ' ' && charString1[i] != '.') {
                strArr1[j]+=charString1[i];
                strArr2[j]+=charString2[i];
            }
            if (charString1[i] == ' ' || charString1[i] == '.') {
                j++;
            }
        }
//
//        showStringInArray(strArr1);
//        showStringInArray(strArr2);
//
        for (int i=0; i<strArr1.length; i++) {
            char[] temp = strArr1[i].toCharArray();
            strArr1[i]="";
            for (int j=temp.length-1; j>=0; j--) {
                strArr1[i] += temp[j];
            }
        }
//
//        showStringInArray(strArr1);
//
        for (int i=0; i<strArr1.length; i++) {
            if (strArr1[i].equalsIgnoreCase(strArr2[i])) {
                isPalHere=true;
            }
        }
        return isPalHere;
    }

    public void sentenceChecker() {

        s = s.replaceAll("\\s+", " ");
        s = s.replace(". " , ".");
//
//        System.out.println(s);
//
//        System.out.println(counter);
//
        String[] stringArray = new String[spaceCounter()];
        Arrays.fill(stringArray, "");

        for (int i=0, j=0; i<s.length(); i++) {
            if (s.charAt(i) != (char)46) {
                stringArray[j] += s.charAt(i);
            }
            if (s.charAt(i) == (char)46) {
                stringArray[j] += s.charAt(i);
                j++;
            }
        }
        showStringInArray(stringArray);
//        for (String str : stringArray) {
//            showStringInfo(str);
//        }
    }
}
