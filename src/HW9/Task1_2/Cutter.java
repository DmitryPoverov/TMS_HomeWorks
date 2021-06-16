package HW9.Task1_2;

import java.util.Arrays;

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

        s = s.replace(", ", " ");
        int zeroCounter = 0;

        char[] charArray1 = s.toCharArray();        // переделываем исходную строку в массив char[]

        for (char cArr : charArray1) {              // считаем количество пробелов
            if (cArr == ' ') {
                zeroCounter++;
            }
        }

        String[] stringArr = new String[zeroCounter+1]; // по количеству пробеллов инициализируем количество ячеек
        Arrays.fill(stringArr, "");                 // инициализируем ячейки пустым значением

        for (int i=0, j=0; i<charArray1.length; i++) {  // перебираем массив char[]
            if (charArray1[i] != ' ') {
                stringArr[j] += charArray1[i];          // и сохраняем в элементы массива String[]
            }
            if (charArray1[i] == ' ') {                 // если натыкаемся на пробел идем в следующую ячейку String[]
                j++;
            }
        }

        for (int i=0; i<stringArr.length; i++) {
            char[] temp = stringArr[i].toCharArray();
            stringArr[i] = "";
            for (int j=temp.length-1; j>=0; j--) {
                stringArr[i] += temp[j];
            }
        }

        for (String str : stringArr) {
            System.out.println(str);
        }

        String[] stringArr2 = new String[zeroCounter+1];
        Arrays.fill(stringArr2, "");

        String s1 = "";


        return s1;
    }
}
